import java.util.ArrayList;
import java.util.List;

// Criando exceções personalizadas!
class JogoIndisponivelException extends Exception {
    public JogoIndisponivelException(String message) {
        super(message);
    }
}

class JogoNaoEmprestadoException extends Exception {
    public JogoNaoEmprestadoException(String message) {
        super(message);
    }
}

// A classe Jogo!
class Jogo {
    private String titulo;
    private boolean disponivel;

    public Jogo(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void emprestar() throws JogoIndisponivelException {
        if (!disponivel) {
            throw new JogoIndisponivelException("O jogo '" + titulo + "' já está emprestado.");
        }
        disponivel = false;
        System.out.println("O jogo '" + titulo + "' foi emprestado.");
    }

    public void devolver() throws JogoNaoEmprestadoException {
        if (disponivel) {
            throw new JogoNaoEmprestadoException("O jogo '" + titulo + "' não está emprestado.");
        }
        disponivel = true;
        System.out.println("O jogo '" + titulo + "' foi devolvido.");
    }
}

// Agora, a classe Usuario!
class Usuario {
    private String nome;
    private List<Jogo> colecao;

    public Usuario(String nome) {
        this.nome = nome;
        this.colecao = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        colecao.add(jogo);
        System.out.println("Jogo '" + jogo.getTitulo() + "' adicionado à coleção de " + nome + ".");
    }

    public void emprestarJogo(String titulo) {
        for (Jogo jogo : colecao) {
            if (jogo.getTitulo().equals(titulo)) {
                try {
                    jogo.emprestar();
                } catch (JogoIndisponivelException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Jogo '" + titulo + "' não encontrado na coleção de " + nome + ".");
    }

    public void devolverJogo(String titulo) {
        for (Jogo jogo : colecao) {
            if (jogo.getTitulo().equals(titulo)) {
                try {
                    jogo.devolver();
                } catch (JogoNaoEmprestadoException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Jogo '" + titulo + "' não encontrado na coleção de " + nome + ".");
    }
}

// Classe principal para demonstrar o uso!
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Montanha");

        // Criando os jogos para adicionar a coleção! :D
        Jogo jogo1 = new Jogo("Wilson, o Humaninho Aventureiro");
        Jogo jogo2 = new Jogo("Mortal Kombat: Shaolin Monks");

        // Adicionando os jogos à coleção do usuário!
        usuario1.adicionarJogo(jogo1);
        usuario1.adicionarJogo(jogo2);

        // Realização de operações bonitinho(fé)!
        usuario1.emprestarJogo("Wilson, o Humaninho Aventureiro");
        usuario1.emprestarJogo("Wilson, o Humaninho Aventureiro");  // O Esperado é gerar uma exceção
        usuario1.devolverJogo("Wilson, o Humaninho Aventureiro");
        usuario1.devolverJogo("Mortal Kombat: Shaolin Monks");  // O Esperado também é gerar uma exceção
        usuario1.emprestarJogo("Hello Kitty: Roller Rescue");  // Jogo inexistente :(
    }
}
