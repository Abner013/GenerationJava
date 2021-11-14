package Familia38;

public class TesteAutomovel {
	
	public static void main(String[] args) {
		
		//instaciando um objeto da classe Automovel
		Automovel auto1 = new Automovel("Vinicius Vinha", "Celta", "ABC-1234",2014);
		auto1.imprimirInfo();
		System.out.println("\n***Tranferência de Proprietário**");
		auto1.setNomeProprietario("Pedro Jones");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Marcela Almeida","Fusca","VEF245",1989);
		auto2.imprimirInfo();
		System.out.println("\n8***Mudança de Placa***");
		auto2.setPlaca("CDE200");
		auto2.imprimirInfo();
	}

}
