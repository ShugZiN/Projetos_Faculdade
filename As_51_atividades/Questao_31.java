package As_51_atividades;

import java.util.Scanner;
public class Questao_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lojas Tabajara");
        
        int contador = 1;
        double totalCompra = 0;
        double precoProduto;
        
        while (true) {
            System.out.print("Produto " + contador + ": R$ ");
            precoProduto = scanner.nextDouble();
            if (precoProduto == 0) {
                break; 
            }   
            totalCompra += precoProduto;
            contador++;
        }
        System.out.println("Total: R$ " + totalCompra);  
        System.out.print("Dinheiro: R$ ");

        double dinheiro = scanner.nextDouble();
        double troco = dinheiro - totalCompra;

        System.out.println("Troco: R$ " + troco);
        scanner.close();
    }
}
