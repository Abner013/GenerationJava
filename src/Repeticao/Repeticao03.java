package Repeticao;

import java.util.Scanner;

public class Repeticao03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, p21 = 0, p50 = 0;
		
		System.out.println("Fale sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
		}
		if (idade>50) {
			p50++;
		}
		if(idade<21) {
			p21++;
		}
		System.out.println("Pessoas com menos de 21 são " + p21 + "e pessoa com mais de 50 são " + p50 );
	}
}
