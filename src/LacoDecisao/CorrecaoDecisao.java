package LacoDecisao;

import java.util.Scanner;

public class CorrecaoDecisao { // exercicio 01 correção 
	
	public static void main (String [] args) {
		int a,b,c,n;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor de A");
		System.out.println("Entre com valor de B");
		System.out.println("Entre com valor de C");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if(a > b && a > c) {
			n = a;
		}
		else if(b > a && b > c) {
			n = b ;
		}
		else {
			n = c ;
		}
		System.out.println("o maior numero e " + n);
	}

}
