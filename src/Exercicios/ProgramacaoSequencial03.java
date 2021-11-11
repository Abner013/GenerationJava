package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float tds;
		float tdh;
		float tdd;   

		  System.out.println("Informe o tempo de duração em segundos: "); 
		  tds = leia.nextInt(); 
		 

		tdh = (tds/60);
		tdd= (tdh/24);

		System.out.println(" O tempo de duração em segundos é " + tds + " Segundos" );
		System.out.println( " O tempo de duração em horas é "+ tdh + " horas " );
		System.out.println( " O tempo de duração em dias é "+ tdd + " Dias" );
		 
		 
		}
		
	}

