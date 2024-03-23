package As_51_atividades;

import java.util.Scanner;

public class Questao_07 {
      public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Escreva o 1° numero: ");
	      int num = scanner.nextInt(); // numero
	      System.out.println("Escreva o 2° numero: ");
	      int num2 = scanner.nextInt();
	      int maiornum; // maior numero
	        if (num > num2) {
	            maiornum = num;
	        } else {
	            maiornum = num2;
	        }
	      
	      System.out.println("Escreva o 3° numero: ");
	      int num3 = scanner.nextInt();
	      if (num3 > maiornum) {
	            maiornum = num3;
	        }
	      
	      System.out.println("Escreva o 4° numero: ");
	      int num4 = scanner.nextInt();
	      if (num4 > maiornum) {
	            maiornum = num4;
	        }
	      
	      System.out.println("Escreva o 5° numero: ");
	      int num5 = scanner.nextInt();
	      if (num5 > maiornum) {
	            maiornum = num5;
	        }
	      
	      System.out.println("O maior número é: " + maiornum);
	        scanner.close();
	    }
}
