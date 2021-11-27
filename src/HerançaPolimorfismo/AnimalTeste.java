package HerançaPolimorfismo;

public class AnimalTeste {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Gledstone", 7);
		Cavalo cavalo = new Cavalo ("Pedi Pano", 12);
		Preguica preguica = new Preguica ("Zoninha", 4);
		
		System.out.println(cachorro);
		cachorro.acao();
		
		System.out.println(cavalo);
		cavalo.acao();
		
		System.out.println(preguica);
		preguica.acao();
	}

}
