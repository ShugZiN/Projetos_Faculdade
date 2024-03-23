package As_51_atividades;

import java.util.Scanner;
public class Questao_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do ginasta: ");

        String nomeGinasta = scanner.nextLine();
        double[] notas = new double[7];
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota do jurado " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        double melhorNota = notas[0];
        double piorNota = notas[0];

        for (int i = 1; i < 7; i++) {
            if (notas[i] > melhorNota) {
                melhorNota = notas[i];
            }
            if (notas[i] < piorNota) {
                piorNota = notas[i];
            }
        }
        
        double soma = 0;

        for (double nota : notas) {
            if (nota != melhorNota && nota != piorNota) {
                soma += nota;
            }
        }

        double media = soma / 5;

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.printf("Média: %.2f\n", media);
        scanner.close();
    }
}
