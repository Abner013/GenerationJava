package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial02 {
	
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano, dias;
		
		System.out.println("Digite sua vida: ");
		dia = leia.nextInt();
		
		mes = dia / 12;
		ano = dia / 365;
		dias = (dia%30)%30;
		System.out.println("Voce tem " + ano + " anos " + mes + " mese " + dias + " dias ");
	}
}
