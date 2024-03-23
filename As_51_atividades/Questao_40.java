package As_51_atividades;

import java.util.Scanner;
public class Questao_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigoCidade;
        int veiculosPasseio;
        int acidentesTransito;
        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        String cidadeMaiorIndice = "";
        String cidadeMenorIndice = "";
        int totalVeiculos = 0;
        int totalAcidentesCidadesMenos2000 = 0;
        int totalCidadesMenos2000 = 0;
        
        for (int i = 1; i <= 5; i++) {

            System.out.println("Cidade " + i);
            System.out.print("Código da cidade: ");
            codigoCidade = scanner.nextInt();
            System.out.print("Número de veículos de passeio (em 1999): ");
            veiculosPasseio = scanner.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
            acidentesTransito = scanner.nextInt();
            totalVeiculos += veiculosPasseio;
            if (veiculosPasseio < 2000) {
                totalAcidentesCidadesMenos2000 += acidentesTransito;
                totalCidadesMenos2000++;
            }
            if (acidentesTransito > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = acidentesTransito;
                cidadeMaiorIndice = "Cidade " + codigoCidade;
            }
            if (acidentesTransito < menorIndiceAcidentes) {
                menorIndiceAcidentes = acidentesTransito;
                cidadeMenorIndice = "Cidade " + codigoCidade;
            }
        }
        double mediaVeiculos = (double) totalVeiculos / 5;
        double mediaAcidentesCidadesMenos2000 = totalCidadesMenos2000 > 0 ? (double) totalAcidentesCidadesMenos2000 / totalCidadesMenos2000 : 0;
        System.out.println("\nResultados:");
        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndiceAcidentes + " - " + cidadeMaiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndiceAcidentes + " - " + cidadeMenorIndice);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentesCidadesMenos2000);
        scanner.close();
    }
}
