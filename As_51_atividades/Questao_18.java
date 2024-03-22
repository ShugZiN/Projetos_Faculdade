package As_51_atividades;

import java.util.Scanner;
public class Questao_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos do conjunto: ");

        int n = scanner.nextInt();
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            int valor = scanner.nextInt();
                     soma += valor;
               if (valor < menor) {
                     menor = valor;
            }
               if (valor > maior) {
                      maior = valor;
            }
        }
        System.out.println("O menor valor é " + menor);
        System.out.println("O maior valor é " + maior);
        System.out.println("A soma dos valores é " + soma);
        scanner.close();
    }
}