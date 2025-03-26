package Swich_Ternaro;

import java.util.Scanner;

public class IfParaTernario {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite um número inteiro");
	int numero = ler.nextInt();
	
	String msg = numero % 2 == 0 ? "O número é par" : "O número é ímpar";
	System.out.println(msg);
	}

}
