package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial07 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c =0, d, e, f, x, y;
		
		System.out.println("\nFalei o numero de A: ");
		System.out.println("\nFalei o numero de B: ");
		System.out.println("\nFalei o numero de C: ");
		System.out.println("\nFalei o numero de D: ");
		System.out.println("\nFalei o numero de E: ");
		System.out.println("\nFalei o numero de F: ");
		
		a = leia.nextInt();
		b = leia.nextInt();
		e = leia.nextInt();
		d = leia.nextInt();
		e = leia.nextInt();
		f = leia.nextInt();
		
		x = (c * e) - (b * f) / (a * e) - (b * d) ;
		y = (a * f) - (c * d) / (a * e) - (b * d) ;
		
		System.out.println("Valor de X = " + x + "\ne valor de y = " + y );
	}

}
