package ProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial08 {
	
	/*
	 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.
	 * */
	
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
