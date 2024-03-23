package As_51_atividades;

import java.util.Scanner;

public class Questao_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        boolean primo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Este número: " + numero + " é um número primo.");
        } else {
            System.out.println("Este número: " + numero + " não é um número primo.");
        }
    }
}