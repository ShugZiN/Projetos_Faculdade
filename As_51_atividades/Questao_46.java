package As_51_atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Questao_46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> saltos = new ArrayList<>();
        
        while (true) {
            System.out.print("Digite o nome do atleta (ou digite 'fim' para encerrar): ");

            String nomeAtleta = scanner.nextLine();
            
            if (nomeAtleta.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Atleta: " + nomeAtleta);
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + getOrdinal(i) + " Salto: ");
                double salto = scanner.nextDouble();
                saltos.add(salto);
            }
            scanner.nextLine();
       
            double melhorSalto = saltos.stream().max(Double::compare).orElse(0.0);
            double piorSalto = saltos.stream().min(Double::compare).orElse(0.0);

            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);
            
            double soma = 0;

            for (double salto : saltos) {
                soma += salto;
            }

            double media = soma / 3;
            
            System.out.println("\nMelhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + media + " m\n");
            System.out.println("Resultado final:");
            System.out.println(nomeAtleta + ": " + media + " m\n");
            saltos.clear(); 
        }
        scanner.close();
    }
    public static String getOrdinal(int numero) {
        if (numero >= 10 && numero <= 20) {
            return numero + "º";
        }
        switch (numero % 10) {
            case 1:
                return numero + "º";
            case 2:
                return numero + "º";
            case 3:
                return numero + "º";
            default:
                return numero + "º";
        }
    }
}
