package As_51_atividades;

import java.util.Scanner;

public class Questao_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo (N): ");

        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Não existem números primos menores que 2.");
        } else {
            System.out.println("Números primos entre 1 e " + n + ":");

            int totalDivisoes = 0;

            for (int i = 2; i <= n; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i);
                    totalDivisoes++;
                }
            }
            System.out.println("Total de divisões realizadas: " + totalDivisoes);
        }
        scanner.close();
    }
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
    
        for (int i = 5; i * i <= numero; i = i + 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
