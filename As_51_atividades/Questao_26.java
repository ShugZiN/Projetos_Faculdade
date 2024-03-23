package As_51_atividades;
 
import java.util.Scanner;
public class Questao_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite algum número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        int[] votos = new int[3]; // Array para armazenar os votos dos candidatos
        
        for (int i = 0; i < totalEleitores; i++) {
            System.out.println("Eleitor " + (i + 1) + ":");
            System.out.println("Digite algum número do candidato sendo, 1, 2 ou 3: ");
            int voto = scanner.nextInt();
            
            // Verifica se o voto é válido (1, 2 ou 3)
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++; // Incrementa o número de votos do candidato correspondente
            } else {
                System.out.println("Voto inválido. Favor, votar novamente.");
                i--; // Decrementa o contador para permitir que o eleitor vote novamente
            }
        }
        
        System.out.println("Resultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos.");
        }
        
        scanner.close();
    }
}
