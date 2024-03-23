package As_51_atividades;

import java.util.Scanner;
public class Questao_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Fatorial de: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" . ");
            }
            fatorial *= i;
        }
        System.out.println(" = " + fatorial);
        scanner.close();
    }
}
