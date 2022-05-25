package atividadeWebConfFaltantes;

public class Endereco {

	private String rua = "Rua Sete";
	private int num = 85;
	private Cidade cidade = new Cidade();
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}	
	
	
}
