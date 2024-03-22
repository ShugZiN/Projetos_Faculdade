package As_51_atividades;

import java.util.Scanner;
public class Questao_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum número inteiro: ");
        int num = scanner.nextInt();
        boolean prim = primo(num);

        if (prim) {
            System.out.println("Este número: " +num+ " é um número primo.");
        } else {
            System.out.println("Este número: " +num+ " não é um número primo.");
        }
        scanner.close();
    }
 

    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
     }
        return true;
   }
}