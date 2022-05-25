package atividadeWebConfFaltantes;

public class Imovel {
	
	private int valAluguel = 500;
	private String tipoMaterial = "Alvenaria";
	private Endereco endereco = new Endereco();
	private Proprietario proprietario = new Proprietario();	
	
	public int getValAluguel() {
		return valAluguel;
	}
	public void setValAluguel(int valAluguel) {
		this.valAluguel = valAluguel;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	public Proprietario getProprietario() {
		return proprietario;
	}	
	

}
