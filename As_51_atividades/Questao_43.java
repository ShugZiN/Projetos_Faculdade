package As_51_atividades;

import java.util.Scanner;

public class Questao_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cardapio = {
            {"Cachorro Quente", "100", "1.20"},
            {"Bauru Simples", "101", "1.30"},
            {"Bauru com ovo", "102", "1.50"},
            {"Hambúrguer", "103", "1.20"},
            {"Cheeseburguer", "104", "1.30"},
            {"Refrigerante", "105", "1.00"}
        };
        
        double totalGeral = 0;
        
        while (true) {
            System.out.print("Digite o código do item (ou -1 para encerrar): ");
            String codigo = scanner.next();
            
            if (codigo.equals("-1")) {
                break;
            }

            double precoItem = 0;

            for (String[] item : cardapio) {
                if (item[1].equals(codigo)) {
                    precoItem = Double.parseDouble(item[2]);
                    break;
                }
            }
            if (precoItem == 0) {
                System.out.println("Código inválido!");
                continue;
            }
            
            System.out.print("Digite a quantidade desejada: ");

            int quantidade = scanner.nextInt();
            double valorItem = precoItem * quantidade;

            totalGeral += valorItem;
            System.out.println("Valor a ser pago por item: R$ " + valorItem);
        }
        System.out.println("Total geral do pedido: R$ " + totalGeral);
        scanner.close();
    }
}
