package Heran�aPolimorfismo;

public class Preguica extends Animal implements Som{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void QualSom() {
		System.out.println("AAAaaAAAAaAaAAAa ... pregui�a");
	}
	
	@Override
	public void acao() {
		System.out.println("Indo muito lento ... escalando arvores");
	}

}
