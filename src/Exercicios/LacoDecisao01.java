package Exercicios;

import java.util.Scanner;

public class LacoDecisao01 {
	public static void min(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, y, z, n;
		
		System.out.println("Diga o valor de X");
		System.out.println("Diga o valor de Y");
		System.out.println("Diga o valor de Z");
		x = leia.nextInt();
		y = leia.nextInt();
		z = leia.nextInt();
		
		if(x > y && x > z) {
			n = x;
		}
		else if(y > x && y > z) {
			n = y ;
		}
		else {
			n = z ;
		}
		System.out.println("o maior numero e " + n);
	}
	

}
