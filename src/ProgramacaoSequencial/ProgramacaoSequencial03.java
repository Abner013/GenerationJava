package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial03 {
	
	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma 
	 * f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float tds;
		float tdh;
		float tdd;   

		  System.out.println("Informe o tempo de dura��o em segundos: "); 
		  tds = leia.nextInt(); 
		 

		tdh = (tds/60);
		tdd= (tdh/24);

		System.out.println(" O tempo de dura��o em segundos � " + tds + " Segundos" );
		System.out.println( " O tempo de dura��o em horas � "+ tdh + " horas " );
		System.out.println( " O tempo de dura��o em dias � "+ tdd + " Dias" );
		 
		 
		}
		
	}

