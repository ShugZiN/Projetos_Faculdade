package As_51_atividades;


import java.util.Scanner;
public class Questao_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = 0;

        if (num <= num2) {
            for (int i = num; i <= num2; i++) {
                soma += i;
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num; i++) {
                soma += i;
                System.out.println(i);
            }
        }
        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}