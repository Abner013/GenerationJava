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
		
		if(idade>=18) { // la�o de decisao simples
			System.out.printf("\nVoc� � maior de idade ...");
		}
		else if (idade >= 1 && idade < 18) { //la�o de decis�o composto
			System.out.println("\nVoc� � menor de idade");
		}
		else { 
			System.out.println("\nVoc� entrou com idade invalida"); // dado(s) invalidados
		}
	}
	
}
