package As_51_atividades;

import java.util.Scanner;

public class Questao_08 {
    	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 5 números:");
	        int num = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();
	        int num4 = scanner.nextInt();
	        int num5 = scanner.nextInt();
	        int soma = num + num2 + num3 + num4 + num5;
	        double media = soma / 5.0;

	           System.out.println("A soma dos números é: " + soma);
	        System.out.println("E a média dos números é: " + media);
	        scanner.close();
	   }
}
