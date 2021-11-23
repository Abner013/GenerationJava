package OrientacaoObjeto;

import java.util.Scanner;

public class AviaoTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String TipoAviao, ModeloAviao;
		double NummAviao;
		int	DonoAviao;
		
		System.out.println("Qual é o tipo do aviao: ");
		System.out.println("Qual é o modelo do aviao: ");
		System.out.println("Qual é o Numeração do aviao: ");
		System.out.println("Qual é o Dono do aviao: ");
		
		TipoAviao = leia.next();
		ModeloAviao = leia.next();
		NummAviao = leia.nextDouble();
		DonoAviao = leia.nextInt();
		
		Aviao aviao00 = new Aviao();
		
		// tipo de aeronave, modelo, numeração, qual grupo pertence
		
		aviao00.getTipoAviao();
		aviao00.getModeloAviao();
		aviao00.getNummAviao();
		aviao00.getDonoAviao();
		
		aviao00.setTipoAviao(TipoAviao);
		aviao00.setModeloAviao(ModeloAviao);
		aviao00.setNummAviao(DonoAviao);
		aviao00.setDonoAviao(DonoAviao);
		
		System.out.println("###################### Aeronaves ######################");
		System.out.println("\n Tipo do Aviao" + TipoAviao);
		System.out.println("\n Modelo do Aviao ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
}
