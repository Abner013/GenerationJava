package Bloco1;

import java.util.*;

public class Condicional1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.println("\nEntre com sua idade: ");
		idade = ler.nextInt();
		
		ler.nextLine();// limpar o Boofer de memoria
		
		System.out.println("\nEntre com seu nome: ");
		nome = ler.nextLine(); //entrada de dados
		
		System.out.printf("\nSeu nome: %s",nome); // %s pegue um valor do tipo STRING 
		System.out.printf("\nSua idade: %d",idade); // %d representa a variavel inteira (INT)
		
		if(idade>=18) { // laço de decisao simples
			System.out.printf("\nVocê é maior de idade ...");
		}
		else if (idade >= 1 && idade < 18) { //laço de decisão composto
			System.out.println("\nVocê é menor de idade");
		}
		else { 
			System.out.println("\nVocê entrou com idade invalida"); // dado(s) invalidados
		}
	}
	
}
