package LacoDecisao;

import java.util.Scanner;

public class LacoDecisao02 {
	public static void main(String[] args) {
		
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Digite o valor de A ");
		System.out.println("Digite o valor de B ");
		System.out.println("Digite o valor de C ");
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		if(a >b && a > c ) {
			if ( b > c ) {
				System.out.println("a Ordem �" + a + "" + b + "" + c);
			}
			else {
				System.out.println("a Ordem �" + b + "" + c + "" + a);
			}
		}
		
		else if (b > a && b > c) {
			if(a > c){
				System.out.println("a Ordem �" + c + "" + a + "" + b);
			}
			else {
				System.out.println("a Ordem � " + a + "" + c + "" + b);
			}
		}
		else if (c > a && c > b) {
			if (b > a) {
				System.out.println("a Ordem � " + a +""+ b + "" + c );
			}
			else {
				System.out.println("a Ordem � " + b + "" + a + "" + c);
			}
		}
	}
}
 