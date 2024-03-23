package As_51_atividades;

import java.util.Scanner;
public class Questao_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Montar a tabuada de: ");

        int numero = scanner.nextInt();
        
        System.out.print("Começar por: ");

        int inicio = scanner.nextInt();
        
        System.out.print("Terminar em: ");

        int fim = scanner.nextInt();
        
        System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
