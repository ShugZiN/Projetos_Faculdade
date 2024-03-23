package As_51_atividades;

import java.util.Scanner;
public class Questao_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da dívida: R$ ");

        double valorDivida = scanner.nextDouble();
        
        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        imprimirDadosDivida(valorDivida, 1, 0);
        imprimirDadosDivida(valorDivida, 3, 10);
        imprimirDadosDivida(valorDivida, 6, 15);
        imprimirDadosDivida(valorDivida, 9, 20);
        imprimirDadosDivida(valorDivida, 12, 25); 
        scanner.close();
    }
    public static void imprimirDadosDivida(double valorDivida, int quantidadeParcelas, double percentualJuros) {

        double valorJuros = valorDivida * (percentualJuros / 100);
        double valorTotalDivida = valorDivida + valorJuros;
        double valorParcela = valorTotalDivida / quantidadeParcelas;
        
        System.out.printf("R$ %.2f         | R$ %.2f          | %d                       | R$ %.2f%n",
                          valorTotalDivida, valorJuros, quantidadeParcelas, valorParcela);
    }
}
