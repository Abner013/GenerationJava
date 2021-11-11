package Bloco1;

import java.util.Scanner;

public class RepeticaoWhile {
	public static void main(String[] args) {
		float numeros, somaNumero=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o numero: ");
		numeros = ler.nextFloat();
		
		while(numeros!=0) {
			somaNumero += numeros;
			System.out.println("\nEntre com um numero");
			numeros = ler.nextFloat();
		}
		System.out.println("\nSomatória dos núemros: "+ somaNumero);
	}
}
