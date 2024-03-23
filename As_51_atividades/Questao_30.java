package As_51_atividades;

import java.util.Scanner;
public class Questao_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do pão: ");

        double precoPao = scanner.nextDouble();

        System.out.println("Tabela de Preços:");
        for (int i = 1; i <= 50; i++) {

            double precoT = precoPao * i;
            
            System.out.println(i + " pães - R$" + precoT);
        }
        scanner.close();
    }
}
