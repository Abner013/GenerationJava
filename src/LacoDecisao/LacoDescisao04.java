package LacoDecisao;

import java.util.Scanner;

public class LacoDescisao04 {
	public static void main(String[] args) {
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		int x; 
		double r;
		
		System.out.println("Digite qualquer numero ... ");
		x = ler.nextInt();
		
		if (x % 2 == 0) {
			r = Math.sqrt(x);
			System.out.println("O numero digitado � par e sua raiz quadrada �: " + r);
		}
		
		else {
			r = Math.pow(x, 2);
			System.out.println("O numero digitado � impar e sua potencia (x�) �: " + r);
		}
		
	}
}
