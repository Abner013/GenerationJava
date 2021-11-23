package OrientacaoObjeto;

public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private String contaCliente;
	private int senhaCliente;
	
	public Cliente (String nomeCliente, String cpfCliente, String contaCliente, int senhaCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.contaCliente = contaCliente;
		this.senhaCliente = senhaCliente;
	}
	
	public void DadosCliente () {
		System.out.println("\n" + nomeCliente +" "
								+ cpfCliente +" "
								+ contaCliente +" "
								+ senhaCliente + "");
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getContaCleinte() {
		return contaCliente;
	}

	public void setContaCleinte(String contaCleinte) {
		this.contaCliente = contaCleinte;
	}

	public int getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(int senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	

}
	
	
	