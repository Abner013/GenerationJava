package Familia38;

public class Empregado1 extends Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endereco, String cpf, int telefone, int idade,
			int codigoSetor, float salarioBase, float imposto) {
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public void ImprimirInfo() {
		System.out.println();
	}
	public void calcularSalario() {
		
	}

}
