package Swich_Ternaro;

import java.util.Scanner;

public class UsuarioESenha {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		
		System.out.println("Informe seu login:");
		String usuario = ler.nextLine();
		
		System.out.print ("Informe sua senha:");
		
		String senha = ler.nextLine();
		System.out.println(usuario.equals("LauraSenai") && (senha.equals ("123456"))? "Usuário e senha aceitos" : "Senha ou login incorretos");

	}

}
