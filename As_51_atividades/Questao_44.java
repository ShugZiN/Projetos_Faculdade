package As_51_atividades;

import java.util.Scanner;
public class Questao_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        
        while (true) {
            System.out.print("Digite o código do voto (1 a 6, ou 0 para encerrar): ");

            int voto = scanner.nextInt();
            
            if (voto == 0) {
                break;
            }
            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Código de voto inválido!");
            }
            totalVotos++;
        }
        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i]);
        }
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Percentagem de votos nulos sobre o total de votos: " + (double) votosNulos / totalVotos * 100 + "%");
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + (double) votosBrancos / totalVotos * 100 + "%");
        scanner.close();
    }
}
