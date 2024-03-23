package As_51_atividades;

import java.util.Scanner;

public class Questao_13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base, expoente, resultado = 1;

        System.out.println("Digite a base: ");
        base = entrada.nextInt();
        System.out.println("Agora, digite o expoente: ");
        expoente = entrada.nextInt();
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println("O resultado é " + resultado);
        entrada.close();
    }
}