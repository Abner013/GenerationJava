package Repeticao;

import java.util.Scanner;

public class CorrecaoRepeticao4 {
	public static void main (String[] agrs) {  // exercicio 04
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, fp,contpc = 0, contmn = 0, contha = 0, contoc = 0, contpn40 = 0, contpc18 = 0, x = 1;
		
		while(x<=5) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<=0 || idade>=125) 
			{
				System.out.println("\nEntre com a idade:");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o seu genero:\n1 - Feminino:\n2 - Masculino");
			genero = leia.nextInt();
		}
	}

}
