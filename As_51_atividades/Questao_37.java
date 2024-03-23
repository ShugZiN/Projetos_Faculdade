package As_51_atividades;

import java.util.Scanner;

public class Questao_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigoCliente;
        double altura, peso;
        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int totalClientes = 0;
        
        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
            codigoCliente = scanner.nextInt();
            if (codigoCliente == 0) {
                break;
            }
            System.out.print("Digite a altura do cliente (em metros): ");
            altura = scanner.nextDouble();
            System.out.print("Digite o peso do cliente (em quilos): ");
            peso = scanner.nextDouble();
    
            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
            
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigoCliente;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigoCliente;
            }
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigoCliente;
            }
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigoCliente;
            }
        }
        if (totalClientes > 0) {

            double mediaAlturas = somaAlturas / totalClientes;
            double mediaPesos = somaPesos / totalClientes;
            
            System.out.println("Cliente mais alto:");
            System.out.println("Código: " + codigoMaisAlto + ", Altura: " + alturaMaisAlto);
            System.out.println("Cliente mais baixo:");
            System.out.println("Código: " + codigoMaisBaixo + ", Altura: " + alturaMaisBaixo);
            System.out.println("Cliente mais gordo:");
            System.out.println("Código: " + codigoMaisGordo + ", Peso: " + pesoMaisGordo);
            System.out.println("Cliente mais magro:");
            System.out.println("Código: " + codigoMaisMagro + ", Peso: " + pesoMaisMagro);
            System.out.println("Média das alturas dos clientes: " + mediaAlturas);
            System.out.println("Média dos pesos dos clientes: " + mediaPesos);
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
        scanner.close();
    }
}
