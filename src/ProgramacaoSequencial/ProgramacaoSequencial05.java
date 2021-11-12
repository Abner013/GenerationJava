package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial05 {
	
	//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		
		float nota1, nota2, nota3, mediaFinal=0;
		
		System.out.println("Digite sua nota 1: ");
		System.out.println("Digite sua nota 2: ");
		System.out.println("Digite sua nota 3: ");
		nota1 = leia.nextFloat();
		nota2 = leia.nextFloat();
		nota3 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3) / 3;
		//obs para caso querer apenas 2 casas a pos a virgula ','
		//use System.out.printf(".... %2.2f", ....)
		System.out.printf("\nSua media final: é %2.2f",mediaFinal);
	}
}
