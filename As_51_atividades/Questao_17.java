package As_51_atividades;

import java.util.Scanner;

public class Questao_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int fatorial = calF(numero); // Calcular Fatorial

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        scanner.close();
    }
    public static int calF(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calF(numero - 1);
        }
    }
}