package Repeticao;

import java.util.Scanner;

public class Repeticao05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		
		do{
			System.out.println("Digite um numero:");
			num = ler.nextInt();
			soma = soma +1;
		}while(num !=0);
		
		
		System.out.println("Soma dos numeros é" + soma);
	}

}
