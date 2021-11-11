package Familia38;

import java.util.Arrays;

public class ArrayVetor {

	public static void main(String[] args) {
		
	
	String[] nomes = new String[] {"João","Gustavo","Maria","Ana","Algusto"};
	//String[] endereco = new String[4];
	//int[] numeros = new int[3];
	
	System.out.println("\nNomes não ordenados:");
	for(String nome:nomes) {
		System.out.println(nome);
	}
	//for(int x=1;x<=4;x++) 
	
	System.out.println();
	
	Arrays.sort(nomes);
	
	System.out.println("\nNomes ordenados");
	for(String nome:nomes) {
		System.out.println(nome);
	}
	System.out.println();
	
	/*for(int x=0;x5;x++) {
		System.out.println("\nDigite seus nomes: ");
		nomes = leia.Ler.nextLine();
	}*/
	
	int[] numeros = new int[] {20,2,8,19,100,5,1,6,13};
	System.out.println("\nNumeros não ordenados");
	for(int numero:numeros) {
		System.out.println(numero);
	}
	System.out.println();
	Arrays.sort(numeros);
	for(int numero:numeros) {
		System.out.println(numero);
	}
	System.out.println();
	}
	
}
