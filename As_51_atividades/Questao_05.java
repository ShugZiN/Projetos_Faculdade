package As_51_atividades;

import java.util.Scanner;
public class Questao_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            int popA, popB; // População A, População B
            double taxaA, taxaB; // Taxa de crescimento A, Taxa de crescimento B
            
            do {
                System.out.print("Digite qual a população inicial do país A: ");
                popA = scanner.nextInt();
                System.out.print("Agora, digite qual a população inicial do país B: ");
                popB = scanner.nextInt();

                if (popA <= 0 || popB <= 0) {
                    System.out.println("As populações devem ser maiores que zero. Por favor, tente novamente.");
                }
            } while (popA <= 0 || popB <= 0);

            do {
                System.out.print("Digite qual a taxa de crescimento anual do país A (digite em decimal): ");
                taxaA = scanner.nextDouble();
                System.out.print("Agora, Digite qual a taxa de crescimento anual do país B (digite em decimal): ");
                taxaB = scanner.nextDouble();

                if (taxaA <= 0 || taxaB <= 0) {
                    System.out.println("As taxas de crescimento devem ser maiores que zero. Por favor, tente novamente, ou o erro continuará");
                }
            } while (taxaA <= 0 || taxaB <= 0);

            int anos = 0;
            while (popA <= popB) {
                popA += (int)(popA * taxaA);
                popB += (int) (popB * taxaB);
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            System.out.print("Deseja repetir a operação? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}

