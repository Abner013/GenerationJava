package Exercicios;

import java.util.Scanner;

public class CorrecaoRepeticao3 {
	public static void main(String[] ars) {
		Scanner leia = new Scanner(System.in);
		
		int idade, cont20=0, cont50=0;
		System.out.println("\nEntre com a dua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				cont20++;
			}
			if(idade>50) {
				cont50++;
			}
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("");
	}
}
