package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial04 {
	
		/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		 * d = (r + s) / 2, 
		 * onde 
		 * r = (a + b)�  
		 * s = (b + c)��  
		 */
	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int A=0, B=0, C=0;
			double R, S, D=0;
			
			System.out.println("Digite o valor de A: ");
			System.out.println("Digite o valor de B: ");
			System.out.println("Digite o valor de C: ");
			A = leia.nextInt();
			B = leia.nextInt();
			C = leia.nextInt();
			
			R = Math.pow((A + B),2);
			S = Math.pow((B + A),2);
			
			D = (R + S);
			System.out.printf("\n Saida = " + D);
		}
	}


