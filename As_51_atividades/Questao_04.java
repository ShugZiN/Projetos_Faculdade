package As_51_atividades;
 
import java.util.Scanner;
public class Questao_04 { 
	
	public static void main(String[] args) {
		
        int popA = 80000; // População A
        int popB = 200000; // População B
        double taxaA = 0.03; // Taxa de Crescimento A
        double taxaB = 0.015; // Taxa de Crescimento B
        int anos = 0;

        while (popA <= popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

     System.out.println("Será necessario aproximadamente: " + anos + " anos para que a população do país A consiga ultrapassar ou igualar a população do país B.");
    }
}

