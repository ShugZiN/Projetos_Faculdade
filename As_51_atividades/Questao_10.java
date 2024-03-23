package As_51_atividades;

import java.util.Scanner;

public class Questao_10 {
    	    public static void main(String[] args) { 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro número inteiro:");
	        int num = scanner.nextInt();
	        System.out.println("Digite o segundo número inteiro:");
	        int num2 = scanner.nextInt();
	        if (num <= num2) {
	        System.out.println("Números no intervalo entre " +num+ " e " +num2+ ":");
	        for (int i = num; i <= num; i++) {
	        System.out.println(i);
	        }
	        } else {
	        System.out.println("Números no intervalo entre " +num+ " e " +num2+ ":");
	        for (int i = num; i >= num2; i--) {
	        System.out.println(i);
	      }
	     }
	    scanner.close();
	    }
}
