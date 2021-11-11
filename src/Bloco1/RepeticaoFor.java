package Bloco1;

import java.util.Scanner;

public class RepeticaoFor {
	public static void main (String[] args) {
		float n1, n2, n3, media, mediaGeral, somaMedia=0;
		int x;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=4;x++) {
			System.out.println("Entre coma a primeira nota: ");
			System.out.println("Entre coma a segunda nota: ");
			System.out.println("Entre coma a terceira nota: ");
			n1 = leia.nextFloat();
			n2 = leia.nextFloat();
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3) / 3;
			System.out.printf("\nMedia do aluno(a) %d foi de: %2.2f",x,media);
			
			somaMedia += media;
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nMedia gereal foi de: %2.2f",mediaGeral);
	}	
}
