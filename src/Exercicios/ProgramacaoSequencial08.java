package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float cf, pd, imp, cc; 
		System.out.println("Qual é o custo de fabrica do carro ? ... "); 
		cf = leia.nextFloat();
		
		pd = (float) ((cf * 0.28) + cf) ;
		cc = (float) ((pd * 0.45) + pd) ;
		
		System.out.printf("O custo do automorel e de R$" + cc);
	}
}
