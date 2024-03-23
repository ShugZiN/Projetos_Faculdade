package As_51_atividades;

import java.util.Scanner;
public class Questao_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos do conjunto: ");

        int n = scanner.nextInt();
        int[] valores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextInt();
            while (valores[i] < 0 || valores[i] > 1000) {
                System.out.println("O valor deve estar entre 0 e 1000. Digite novamente: ");
                valores[i] = scanner.nextInt();
            }
        }

        int menor = valores[0];
        int maior = valores[0];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            soma += valores[i];
        }
        System.out.println("O menor valor é " + menor);
        System.out.println("O maior valor é " + maior);
        System.out.println("Agora, a soma de seus valores é " + soma);
    }
}