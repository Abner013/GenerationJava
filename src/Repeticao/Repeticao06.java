package Repeticao;

import java.util.Scanner;

public class Repeticao06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, soma =0 ;
		double media = 0.0, multiplo = 0.0;
		
		do {
			System.out.println("Digite o numero");
			num = ler.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				multiplo++;
				soma = soma + num;
			}
		}while(num != 0);
		media = soma / multiplo;
		System.out.println(media);
		
	}
}


