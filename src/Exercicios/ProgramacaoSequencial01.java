package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia, dias = 0;
		System.out.println("\nDigite seu ano: ");
		System.out.println("\nDigite seu mes: ");
		System.out.println("\nDigite seu dia: ");
		
		ano = leia.nextInt();
		mes = leia.nextInt();
		dia = leia.nextInt();
		
		dias += (ano * 365) + (mes * 30);
		System.out.println("Sua idade em dia e " + dias);
	
	}

}
