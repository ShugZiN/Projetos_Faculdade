package As_51_atividades;

import java.util.Scanner;
public class Questao_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, pares = 0, impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impar);
        scanner.close();
    }
}