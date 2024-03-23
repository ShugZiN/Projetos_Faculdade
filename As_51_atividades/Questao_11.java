package As_51_atividades;

import java.util.Scanner;
public class Questao_11 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int numero1, numero2, i, soma = 0;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        for (i = numero1; i <= numero2; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("A soma dos números é " + soma);
        scanner.close();
    }
}



 
