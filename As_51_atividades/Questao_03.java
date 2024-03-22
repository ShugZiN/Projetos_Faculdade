package As_51_atividades;

import java.util.Scanner;
public class Questao_03 {
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		String nome;
		char sexo, ec; // estado civil
		int idade;
		double salario;
		do {
		
		System.out.println("Digite o seu nome: ");
		nome = imput.next();
		}while (nome.length() <=3);
		
		do {
		System.out.println("Digite a sua idade: ");
		idade = imput.nextInt();
		}while (idade > 0 && idade > 150);
		
		do {
		System.out.println("Agora, Digite o seu salário: ");
		salario = imput.nextDouble();
		}while (salario <=0 );
		
		do {
		System.out.println("Qual o seu sexo? m ou f? ");
		sexo = imput.next().charAt(0);
		}while (sexo != 'm' && sexo != 'f');
		
		do {
		System.out.println("Qual seu estado civil? s, c, v, d? ");
		ec = imput.next().charAt(0);
		}while (ec != 's' && ec != 'c' && ec != 'v' && ec != 'd');
		
		System.out.println("Nome: " +nome+ " / Idade: " +idade+ " / Salário: " +salario+ " / Sexo: " +sexo+ " / Estado Civil: " +ec); 
		}
	}
