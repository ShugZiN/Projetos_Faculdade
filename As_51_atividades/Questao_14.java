package As_51_atividades;

import java.util.Scanner;

public class Questao_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, pares = 0, impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
       scanner.close();
    }
}