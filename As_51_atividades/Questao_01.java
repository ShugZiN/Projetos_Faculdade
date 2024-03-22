package As_51_atividades;

import java.util.Scanner;
public class Questao_01 {
	
    public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    
    double nota;
    boolean notaV = false; // nota valida
    do {
    
    System.out.println("Escreva uma nota de 0 a 10");
    nota = imput.nextDouble();
    
    if(nota >=0 && nota<= 10) {
    	notaV = true;
    	
    	System.out.println("Esta nota é válida : " +nota);
    	
    }else {
    	//notaV = false;
    	System.out.println("Esta nota é invalida: " +nota+ " , Digite outra nota!");
    	
    }
    	
    	
    }while(!notaV);
    }
}
    