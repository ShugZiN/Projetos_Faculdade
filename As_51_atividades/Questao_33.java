package As_51_atividades;

import java.util.Scanner;
public class Questao_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as temperaturas (Você pode digitar 0 para encerrar):");

        double temperatura;
        double somaTemperaturas = 0;
        double maiorTemperatura = Double.MIN_VALUE;
        double menorTemperatura = Double.MAX_VALUE;
        int quantidadeTemperaturas = 0;

        while (true) {
        System.out.print("Temperatura: ");
         temperatura = scanner.nextDouble();

         if (temperatura == 0) {
                break;
         }

        somaTemperaturas += temperatura;
        quantidadeTemperaturas++;

        if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
        }

      if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
         }
        }
        if (quantidadeTemperaturas == 0) {
            System.out.println("Nenhuma temperatura foi inserida.");
        } else {
            double mediaTemperaturas = somaTemperaturas / quantidadeTemperaturas;
            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Menor temperatura: " + menorTemperatura);
            System.out.println("Média das temperaturas: " + mediaTemperaturas);
        }
        scanner.close();
    }
}
