package Bloco1;

import java.util.Scanner;

public class RepeticaoDoWhile {
	public static void main(String[] args) {

		int numero, somaNumero = 0, contNumero = 0;
		float media;

		Scanner leia = new Scanner(System.in);

		System.out.println("anEntre com um numero: ");
		numero = leia.nextInt();

		do {
			if (numero % 2 == 0) {
				somaNumero += numero;
				contNumero++;
			}
			System.out.println("anEntre com um numero: ");
			numero = leia.nextInt();
			
		} while (numero % 2 == 0);
		if (contNumero == 0) {
			System.out.println("erro. ");
		}
		else {
			media = somaNumero / contNumero;
			System.out.println("\nMedia do numero pares: "+ media);
		}
		
		
	}
}
