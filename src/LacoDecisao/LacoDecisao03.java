package LacoDecisao;

import java.util.Scanner;

public class LacoDecisao03 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int idade ;
		System.out.println("Didite sua idade");
		idade = ler.nextInt();
		if(idade >=0 && idade<12 ) {
			System.out.println("criança!");
		}
		else if(idade >=12 && idade <=13) {
			System.out.println("pré-adolecente");
		}
		else if(idade >=14 && idade <=18) {
			System.out.println("Adolecente");
		}
		else if(idade >=19 && idade <65) {
			System.out.println("adulto");
		}
		System.out.println("Sua idade e " + idade);
	}

}
