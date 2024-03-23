package As_51_atividades;

import java.util.Scanner;
public class Questao_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, a1 = 0, a2 = 1, a3;

        System.out.println("Digite o número de termos da série de Fibonacci: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                a3 = i;
            } else {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            System.out.println(a3);
        }
        scanner.close();
    }
}