package As_51_atividades;

import java.util.Scanner;
public class Questao_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de CDs que hã na coleção: ");

        int quantidadeCDs = scanner.nextInt();
        double totalInvestido = 0;
        
        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Agora, digite o valor do CD " + i + ": ");
          
            double valorCD = scanner.nextDouble();
            totalInvestido += valorCD;
        }
        
        double mediaGastoPorCD = totalInvestido / quantidadeCDs;
        
        System.out.println("Valor total investido na coleção de CDs: R$" + totalInvestido);
        System.out.println("Valor médio gasto em cada CD: R$" + mediaGastoPorCD);
        
        scanner.close();
    }
}
