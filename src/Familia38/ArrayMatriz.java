package Familia38;

import java.util.Scanner;

public class ArrayMatriz {
	public static void main(String[] args) {
		
		int[][] numeros = new int[3][4];
		int linha, coluna, somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nEntre com um valor: ");
				numeros[linha][coluna] = leia.nextInt();
				somaValor += numeros[linha][coluna];
			}
		}
		System.out.println("Soma dos valores do meu Array" + somaValor);
	}

}
