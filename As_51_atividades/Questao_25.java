package As_51_atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Questao_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        System.out.print("Quantas pessoas na turma? ");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            
            int idade = scanner.nextInt();
            idades.add(idade);
        }
        double media = calMed(idades); // calcular media
        System.out.println("A média de idade da turma é: " + media);
        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
        scanner.close();
    }
    public static double calMed(List<Integer> idades) {
        int soma = 0;
        for (int idade : idades) {
            soma += idade;
        }
        return (double) soma / idades.size();
    }
}
