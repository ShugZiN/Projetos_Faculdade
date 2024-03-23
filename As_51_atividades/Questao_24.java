package As_51_atividades;

import java.util.Scanner;

public class Questao_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite a quantidade de notas: ");

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade de notas deve ser um número positivo maior que zero.");
            return;
        }
        
        double soma = 0;
        System.out.println("Digite as " + n + " notas:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        double media = soma / n;
        System.out.println("A média aritmética das " + n + " notas é: " + media);
        scanner.close();
    }
}
