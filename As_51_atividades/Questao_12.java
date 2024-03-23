package As_51_atividades;

import java.util.Scanner;

public class Questao_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, i;

        System.out.println("Digite algum número da tabuada que você quer ver: ");
        numero = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
        scanner.close();
    }
}