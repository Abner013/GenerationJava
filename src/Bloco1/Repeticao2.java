package Bloco1;

import java.util.Scanner;

public class Repeticao2 { // WHILE & IF = ENQUANTO & SE 

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		System.out.println("Entre com sua idade: ");
		idade = entrada.nextInt();
		
		//while(idade>=1) { //while = enquanto
		do {
			System.out.printf("Sua idade: %d",idade);
			if (idade >= 18) { // if = se
				System.out.println("\nvoc� � de maior ...");
			}
			else { // else = senao (logica portugol)
				System.out.println("\nVoc� � de menor ...");
			}
			System.out.println("Entre com a sua idade: ");  // aqui e usa para n�o entrar em lupin infinito
			idade = entrada.nextInt();
		}
		while(idade>=1);
		

	}

}
