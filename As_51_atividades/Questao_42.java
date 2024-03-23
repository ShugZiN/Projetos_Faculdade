package As_51_atividades;

import java.util.Scanner;
public class Questao_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        int numero;

        do {
            System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
            numero = scanner.nextInt();
            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
        } while (numero >= 0);
        System.out.println("Quantidade de números nos intervalos:");
        System.out.println("[0-25]: " + intervalo1);
        System.out.println("[26-50]: " + intervalo2);
        System.out.println("[51-75]: " + intervalo3);
        System.out.println("[76-100]: " + intervalo4);
        scanner.close();
    }
}
