package As_51_atividades;

import java.util.Scanner;
public class Questao_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");

        int n = scanner.nextInt();
        double soma = calcularSerie(n);
        
        System.out.println("Soma da série: " + soma);
        scanner.close();
    }
    
    public static double calcularSerie(int n) {

        double soma = 0;
        int numerador = 1;
        int denominador = 1;
        
        for (int i = 1; i <= n; i++) {
            soma += (double) numerador / denominador;
            numerador++;
            denominador += 2;
        }
        return soma;
    }
}
