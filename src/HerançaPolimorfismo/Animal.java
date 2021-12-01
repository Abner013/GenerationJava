package HerançaPolimorfismo;

public class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return "Animal [Nome =" + nome + ", idade =" + idade + "]"; 
	}

	
}
