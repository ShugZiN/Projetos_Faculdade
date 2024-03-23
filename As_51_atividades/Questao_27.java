package As_51_atividades;

import java.util.Scanner;
public class Questao_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite a quantidade de turmas: ");

        int quantTurma = scanner.nextInt(); // quantidade das turmas
        int totalAlunos = 0;  
        for (int i = 1; i <= quantTurma; i++) { 
            int quantAluno; // quantidadde de alunos
         do {
                System.out.print("Digite a quantidade de alunos para a turma " + i + " (máximo de 40 alunos): ");
                quantAluno = scanner.nextInt();
         if (quantAluno > 40) {
                    System.out.println("A quantidade de alunos excede o limite de 40 alunos por turma. Tente novamente.");
                }
        } while (quantAluno > 40);
            
            totalAlunos += quantAluno; 
        }
        
        double mediaAlunosPorTurma = (double) totalAlunos / quantTurma;
        System.out.println("A média de alunos por turma é: " + mediaAlunosPorTurma);
        scanner.close();
    }
}
