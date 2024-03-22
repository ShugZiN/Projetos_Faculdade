package As_51_atividades;

import java.util.Scanner;
public class Questao_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        scanner.close();
    }
}