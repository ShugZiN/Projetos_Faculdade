package As_51_atividades;

import java.util.Scanner; 
public class Questao_02 {
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		String usuario;
		String senha;
		boolean infoV = false;
		do {
			
			System.out.println("Faça login com o usuário: ");
			usuario = imput.next();
			System.out.println("Digite a senha: ");
			senha = imput.next();
			
		if(usuario.equalsIgnoreCase(senha)) {
			infoV = false;
			System.out.println("O usuário e sua senha digitadas, são iguais, favor digitar novamente");
			
		
		}else {
			infoV = true;
			System.out.println("O usuário: "+usuario);
			System.out.println("Senha: "+senha);
			
		}
		}while(!infoV);
		
	}

}


