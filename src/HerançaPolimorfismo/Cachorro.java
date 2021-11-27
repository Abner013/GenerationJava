package HerançaPolimorfismo;

public class Cachorro extends Animal implements Som {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo .......");
	}
	 
	@Override
	public void QualSom() {
		System.out.println("Latido ... AUAUAUAUUA");
	}
	
	@Override
	public void acao() {
		System.out.println("Correr!");
	}

}
