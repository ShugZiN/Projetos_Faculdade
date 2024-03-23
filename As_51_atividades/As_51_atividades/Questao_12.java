package As_51_atividades;

import java.util.Scanner;
public class Questao_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum número inteiro entre 1 e 10:");
        int num = scanner.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("O Número foi inválido. Por favor, digite outro número entre 1 e 10.");
        } else {
            System.out.println("Tabuada do " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
         }
      }
        scanner.close();
  }
}