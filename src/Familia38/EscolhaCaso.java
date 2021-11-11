package Familia38;

import java.util.Scanner;

public class EscolhaCaso {

	public static void main (String[] args) {
		//Todos auto generated method tub
		int op;
		Scanner leia = new Scanner(System.in) ;
		System.out.println("\n\tMenu de opções");
		System.out.println("\n1 - Sabios");
		System.out.println("\n2 - Gentil");
		System.out.println("\n3 - Produtivo");
		System.out.println("\n4 - Legal");
		op = leia.nextInt();
		switch(op) {
		case 1:
			System.out.println("\nSábio...");
			break;
		case 2:
			System.out.println("Gentil");
			break;
		case 3:
			System.out.println("Produtividade");
			break;
		case 4:
			System.out.println("Legal");
			break;
			default:
		}
	}
}
