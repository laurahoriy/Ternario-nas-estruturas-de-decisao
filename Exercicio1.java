package Swich_Ternaro;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
		
		System.out.println("Escolha um número entre 1 e 3");
		
		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi 1");
			break;
		case 2:
			System.out.println("O número escolhido foi 2");
			break;
		case 3:
			System.out.println("O número escolhido foi 3");
			break;
		
			default :
				System.out.println("O número escolhido é inválidp! Digite um número de 1 a 3");
				
			
	}

}
}