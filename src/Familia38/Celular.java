package Familia38;

public class Celular  extends Telefone{
	
	public Celular () {
		super("Celular");
	}
	
	@Override 
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nGera��o cola-cola...");
			break;
		
		case 2:
			System.out.println("\nNokiaTunes-Tururururu");
			break;
			default:
				System.out.println("\nZ�zazazaza");
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nO numer"+ numero + "um celular");
	}

}
