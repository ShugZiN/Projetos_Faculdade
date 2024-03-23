package As_51_atividades;

import java.util.Scanner;
public class Questao_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroAlunoMaisAlto = 0;
        int numeroAlunoMaisBaixo = 0;
        int alturaMaisAlta = Integer.MIN_VALUE;
        int alturaMaisBaixa = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");

            int numeroAluno = scanner.nextInt();
            
            System.out.print("Digite a altura do aluno " + i + " em centímetros: ");

            int alturaAluno = scanner.nextInt();
            
            if (alturaAluno > alturaMaisAlta) {
                alturaMaisAlta = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }
            if (alturaAluno < alturaMaisBaixa) {
                alturaMaisBaixa = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }
        System.out.println("Aluno mais alto:");
        System.out.println("Número do aluno: " + numeroAlunoMaisAlto);
        System.out.println("Altura: " + alturaMaisAlta + " cm");
        System.out.println("Aluno mais baixo:");
        System.out.println("Número do aluno: " + numeroAlunoMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixa + " cm");
        scanner.close();
    }
}
