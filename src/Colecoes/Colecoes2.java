package Colecoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {
	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		ArrayList estoque = new ArrayList();
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("\nDeseja adicionar produtos ao estoque ? ");
			System.out.println("\nDeseja remover produtos do estoque ? ");
			System.out.println("\nDeseja atualiza proditos do estoque ? ");
			System.out.println("\nDeseja mostrar produtos do estoque ? ");
			System.out.println("\nDeseja encerrar o programa ? ");
			System.out.println("-----------------------------------------------");
			System.out.println("\nDigite a sua opção;");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover do estoque");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}
				else {
					System.out.println("\nProduto não encontrado");
				break;
				}
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produtis");
			}
		}while(op!=0);
	}

}
