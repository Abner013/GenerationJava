package Arrays;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais.
		 *  Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double [][] M1 = new double[2][2];
		double [][] M2 = new double[2][2];
		double [][] M3 = new double[2][2];
		int x , y , ops, numero;
		
		for(x = 0; x < 2; x++) {
			for(y = 0; y < 2; y++) {
				System.out.println("Escreva um numero ");
				M1[x][y] = ler.nextDouble();
			}
		}
		
		for(x = 0; x < 2; x++) {
			for(y = 0; y < 2; y++ ) {
				System.out.println("Escreva um numero");
				M2[x][y] = ler.nextDouble();
			}
		}
		
		System.out.println(" ======= Escolha uma opção =======");
		System.out.println("\n1 - Somar as Matrizes \n2 - Subrair a primeira matriz"
							+ "\n3 - adicionar uma constante as duas matrizes"
							+ "\n4 - imprimir as matrizes");
		
		if( ops == 1) {
			for (x = 0; x < 2; x++) {
				for(y = 0; y < 2; y++) {
				M3[x][y] = M1[x][y] + M2[x][y]; 
			}
		}
			
		System.out.println("\n Matriz M3");
		
		if( ops == 2) {
			for (x = 0; x < 2; x++) {
				for(y = 0; y < 2; y++) {
					System.out.println();
				}
			}
		}
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais.
		 *  Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		 */
		
		Scanner ler1 = new Scanner(System.in);
		
		double [][] M11 = new double[2][2];
		double [][] M21 = new double[2][2];
		double [][] M31 = new double[2][2];
		int x1 , y1 = 0 , ops1 = 0, numero1;
		
		for(x1 = 0; x1 < 2; x1++) {
			for(y1 = 0; y1 < 2; y1++) {
				System.out.println("Escreva um numero ");
				M11[x1][y1] = ler.nextDouble();
			}
		}
		
		for(x1 = 0; x1 < 2; x1++) {
			for(y1 = 0; y1 < 2; y1++ ) {
				System.out.println("Escreva um numero");
				M21[x1][y1] = ler.nextDouble();
			}
		}
		
		System.out.println(" ======= Escolha uma opção =======");
		System.out.println("\n1 - Somar as Matrizes \n2 - Subrair a primeira matriz"
							+ "\n3 - adicionar uma constante as duas matrizes"
							+ "\n4 - imprimir as matrizes");
		
		if(ops1 == 1){
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0;y1 < 2; y1++){
					M31[x1][y1] = M21[x1][y1] + M31[x1][y1];
				}
			}

			System.out.println("\nA matriz 1: ");
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0;  y1 < 2; y1++){
					System.out.printf(" %.2f",M11[x1][y1],"\n");
                }
				System.out.println();
				}
		}

		if(ops1 == 2){
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0; y1 < 2; y1++){
					M31[x1][y1] = M11[x1][y1] - M21[x1][y1];
				}
			}
			
			System.out.println("\nA Matriz 3: ");
			for(x1 = 0; x1 < 2; x1++){
				for(x1 = 0; x1 < 2; x1++){
					System.out.printf(" %.2f",M31[x1][y1],"\n");
                }
				System.out.println();
				}
		}

		if(ops1 == 3){
			System.out.println("Escreva o valor constante: ");
			numero1 = ler1.nextInt();

			for(x1 = 0; x1 < 2; x1++){
				for(x1 = 0; x1 < 2;x1++){
					M11 [x1][y1] += numero1;
					M21 [x1][y1] += numero1;
				}
			}

			System.out.println("\nA Matriz 1: ");
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0; y1 < 2; y1++){
					System.out.printf("%.2f",M11[x1][y1],"\n");
                }
				System.out.println();
			}
			
			System.out.println("\nA Matriz 2: ");
			for(x1 = 0; x1 < 2; x1++){
				for(x1 = 0; x1 < 2; x1++){
					System.out.printf(" %.2f",M21[x1][y1],"\n");
				}
				System.out.println();
			}
		}

		if(ops1 == 4){
			System.out.println("\n Matriz A: ");
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0; y1 < 2; y1++){
					System.out.printf(" %.2f",M11[x1][y1],"\n");
                }
				System.out.println();
			}
			
			System.out.println("\nA Matriz 2: ");
			for(x1 = 0; x1 < 2; x1++){
				for(y1 = 0; y1 < 2 ; y1++){
					System.out.printf(" %.2f",M21[x1][y1],"\n");
				}
				System.out.println();
				}
			}
		}
	}
}	
		
		