package PrimeiroPrograma;

import java.util.Scanner;
import java.util.Locale;

public class Ola {
	public static void main(String []args) {
			Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double idade = input.nextDouble();
		double anos = 365*idade;
		double mes = 12;
		System.out.println("Idade"+ idade);
		System.out.println("Mes"+ mes * idade);
		System.out.println("Dias"+ anos);
		
				
	}
		
}
