package Swich_Ternaro;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 18;
		String mensagem = idade >=18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem);//Imprime "Maior ou menor..."

	}

}
