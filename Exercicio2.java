package Swich_Ternaro;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Informe o mês");
	String mes = ler.next();
	
	switch (mes) {
	case "Janeiro":
		System.out.println("Mês 1");
		break;
	case "Fevereiro":
		System.out.println("Mês 2");
		break;
	case "Março":
		System.out.println("Mês 3");
		break;
	case "Abril":
		System.out.println("Mês 4");
		break;
	case "Maio":
		System.out.println("Mês 5");
		break;
	case "Junho":
		System.out.println("Mês 6");
	    break;
	case "Julho":
		System.out.println("Mês 7");
		break;
	case "Agosto":
		System.out.println("Mês 8");
		break;
	case "Setembro":
		System.out.println("Mês 9");
		break;
	case "Outubro":
		System.out.println("Mês 10");
		break;
	case "Novembro":
		System.out.println("Mês 11");
		break;
	case "Dezembro":
		System.out.println("Mês 12");
		break;
		
		default:
			System.out.println("O mês inserido está incorreto");
		
	}
	}

}
