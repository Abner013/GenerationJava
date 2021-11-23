
// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Arrays;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		//  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int x , y , conto = 0 ;
		
		for(x = 0; x < 3; x++) {
			for(y = 0; y < 3; y++) {
				System.out.println("Digite um numero: ");
				matriz[x][y] = leia.nextInt();
			}
		}
		
		System.out.println("Numeros no campo matriz que são maior/igual a 10");
		
		for(x = 0; x < 3; x++ ) {
			for(y = 0; y < 3; y++) {
				if(matriz[x][y] >= 10) {
					System.out.println( matriz[x][y]);
					conto++;
				}
			}
		}
		
		System.out.println("Totalizou " + conto);
		
	

	}

}
