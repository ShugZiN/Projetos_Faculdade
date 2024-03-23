package As_51_atividades;

import java.util.Scanner;
public class Questao_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum número inteiro positivo: ");
        int numero = scanner.nextInt();

        while (numero < 0 || numero > 16) {
            System.out.println("O número deve ser inteiro positivo e menor que 16. Favor digitar novamente: ");
            numero = scanner.nextInt();
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " +numero+ " é " + fatorial);
    }
}