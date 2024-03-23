package As_51_atividades;

import java.util.Scanner;
public class Questao_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da série de Fibonacci: ");
        int n = scanner.nextInt();
        int a1 = 0;
        int a2 = 1;
        int a3 = 0;

        for (int i = 0; i < n; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            System.out.println(a3);
        }
    }
}