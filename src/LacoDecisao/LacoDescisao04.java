package LacoDecisao;

import java.util.Scanner;

public class LacoDescisao04 {
	public static void main(String[] args) {
		
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		int x; 
		double r;
		
		System.out.println("Digite qualquer numero ... ");
		x = ler.nextInt();
		
		if (x % 2 == 0) {
			r = Math.sqrt(x);
			System.out.println("O numero digitado é par e sua raiz quadrada é: " + r);
		}
		
		else {
			r = Math.pow(x, 2);
			System.out.println("O numero digitado é impar e sua potencia (x²) é: " + r);
		}
		
	}
}
