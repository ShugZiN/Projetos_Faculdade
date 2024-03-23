package As_51_atividades;

import java.util.Scanner;

public class Questao_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}