package Bloco1;

public class Repeticao1 { // laço de repetição 
	public static void main(String[] args ) {
		int x, soma=0 ;
		
		// for é o PARA na logica 
		for (x=1;x<=10;x++) { // (inicio ; fim ; condição) - igual a logica | tres argumentos
			
			System.out.printf("\n %d",x); // %d e o que chama o valor inteiro // sem ele não mostra na tela
			soma = soma +x; // somar os valores de 1 a 10.
		}
		System.out.printf("\nSoma total : %d", soma); // %d inteiro mostrar do total
	}
	
}
