package Arrays;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] numero = new int[6]; 
		int i, Par = 0, Impar = 0; 
		
		
		for(i = 0; i < 6; i++){
			System.out.println("Digite os numeros" );
			numero[i] = ler.nextInt();		
		}
		
		System.out.println("Valor de par");
		for(i = 0; i < 6; i++) {
			if(numero[i] % 2 == 0) {
				System.out.println(numero[i]);
				Par+=numero[i];
				
			}			
		}
		
		 System.out.println("A soma dos valores pare é " + Par);
		 
		 System.out.println("Valores Impares ");
		 for(i = 0; i < 6; i++) {
			 if(numero[i] % 2 == 1) {
				 System.out.println(numero[i]);
				 Impar+=numero[i]; 
			 }
		 }
		 
		 System.out.println("a soma dos valores impares é " + Par);
	}
}
