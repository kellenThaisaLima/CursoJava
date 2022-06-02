package atividadeWebConfFaltantes;

public class Proprietario {
	
	private int cpfProp = 1234567899;
	private String nomeProp = "João da Neve";
	private Endereco endereco = new Endereco();
	
	
	public int getCpfProp() {
		return cpfProp;
	}
	public void setCpfProp(int cpfProp) {
		this.cpfProp = cpfProp;
	}
	public String getNomeProp() {
		return nomeProp;
	}
	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}
		
	public Endereco getEndereco() {
		return endereco;
	}	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
