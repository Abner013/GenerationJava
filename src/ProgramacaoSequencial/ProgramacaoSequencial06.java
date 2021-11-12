package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial06 {
	
	//6. Construa um programa em c que, tendo como dados de entrada dois pontos 
	// quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles.
	// A f�rmula que efetua tal c�lculo �: d =  raiz� (x2 - x1)� + (y2 - y1)�

	
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in) ; 
		int x1, x2, y1, y2;
		double d;
		
		System.out.println("Valor de x1: ");
		System.out.println("Valor de x2: ");
		System.out.println("Valor de y1: ");
		System.out.println("valor de y2: ");
		
		x1 = leia.nextInt() ;
		x2 = leia.nextInt() ;
		y1 = leia.nextInt() ;
		y2 = leia.nextInt() ;
		
		//em java a pontencializa��o e dada atravez do metodo Math.pow(base, expoente)  
		d = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) ;  
		
		System.out.println("Calculo efetuado �: " + d);
	}
}
