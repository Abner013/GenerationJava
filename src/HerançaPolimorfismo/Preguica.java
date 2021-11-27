package HerançaPolimorfismo;

public class Preguica extends Animal implements Som{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void QualSom() {
		System.out.println("AAAaaAAAAaAaAAAa ... preguiça");
	}
	
	@Override
	public void acao() {
		System.out.println("Indo muito lento ... escalando arvores");
	}

}
