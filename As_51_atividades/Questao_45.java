package As_51_atividades;

import java.util.Scanner;
public class Questao_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String[] gabarito = new String[10];
        
        System.out.println("Digite o gabarito da prova:");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            gabarito[i] = scanner.nextLine();
        }
        
        int maiorAcerto = 0;
        int menorAcerto = 10;
        int totalAlunos = 0;
        int totalAcertosTurma = 0;
        boolean outroAluno = true;
        
        while (outroAluno) {
        
            String[] respostasAluno = new String[10];
    
            System.out.println("Digite as respostas do aluno:");
            for (int i = 0; i < respostasAluno.length; i++) {
                System.out.print("Resposta da questão " + (i + 1) + ": ");
                respostasAluno[i] = scanner.nextLine();
            }

            int totalAcertos = 0;

            for (int i = 0; i < gabarito.length; i++) {
                if (respostasAluno[i].equalsIgnoreCase(gabarito[i])) {
                    totalAcertos++;
                    totalAcertosTurma++;
                }
            }
            if (totalAcertos > maiorAcerto) {
                maiorAcerto = totalAcertos;
            }
            if (totalAcertos < menorAcerto) {
                menorAcerto = totalAcertos;
            }
            totalAlunos++;
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            String resposta = scanner.nextLine();
            outroAluno = resposta.equalsIgnoreCase("S");
        }
       
        double mediaNotasTurma = (double) totalAcertosTurma / totalAlunos;
        
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotasTurma);
        scanner.close();
    }
}
