package Familia38;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		lista[0] = new Empregado("Tais Ribeiro",20000);
		lista[1] = new Empregado("Mirella Farias",25000);
		lista[2] = new Empregado("Lucas Celestino Diniz",75000);
		
		for(Empregado roda: lista) {
			roda.imprimir(); // imprimir todos os nomes e salarios dos  empregados
		}
		System.out.println("*****************************************************");
		for(Empregado roda: lista) {
			roda.aumentarSalarario(10);
			roda.imprimir();
		}
	}
}
