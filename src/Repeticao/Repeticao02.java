package Repeticao;

import java.util.Scanner;

public class Repeticao02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, par=0, impar=0, i;
		
		for(i=1; i<=10; i++) {
			System.out.println("Digite os numero...");
			num = ler.nextInt();
			if(num%2==0) {
			par++; 	
			}
			if(num%2==1) {
				impar++;
			}
			System.out.println("Pares:"+par);
			System.out.println("Impar:"+impar);
			
		}
		 
	}

}
