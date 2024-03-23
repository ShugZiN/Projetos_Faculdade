package As_51_atividades;

import java.util.Scanner;
public class Questao_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário inicial do funcionário: ");

        double salarioInicial = scanner.nextDouble();
        int anoContratacao = 1995;
        double salarioAtual = salarioInicial;
        
        for (int ano = 1996; ano <= 2024; ano++) {
            
            double aumentoPercentual = calcularAumentoPercentual(ano);
            double aumentoSalarial = salarioAtual * (aumentoPercentual / 100);
           
            salarioAtual += aumentoSalarial;
        }
        System.out.println("O salário atual do funcionário em 2024 é: R$ " + salarioAtual);
        scanner.close();
    }
    
    public static double calcularAumentoPercentual(int ano) {
  
        if (ano == 1996) {
            return 1.5;
        }
        return calcularAumentoPercentual(ano - 1) * 2;
    }
}
