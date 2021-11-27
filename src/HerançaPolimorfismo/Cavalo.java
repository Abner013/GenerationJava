package HerançaPolimorfismo;

public class Cavalo extends Animal  implements Som {
		public Cavalo(String nome,int idade) {
			super(nome,idade);
		}
		
		public void correr() {
			System.out.println("Correndo...");
		}
		
		@Override
		public void Qualsom() {
			System.out.println("*relichando*");
			
		}
		
		@Override
		public void acao() {
			System.out.println("*correndo*");
			
		
	}
}
