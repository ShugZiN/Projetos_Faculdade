package As_51_atividades;

import java.util.Scanner;
public class Questao_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");

        int limite = scanner.nextInt();
        
        System.out.println("Números primos entre 1 e " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (Prim(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
    public static boolean Prim(int numero) {

        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i = i + 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
