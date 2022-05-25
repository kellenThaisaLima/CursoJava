package atividadeWebConfFaltantes;

public class TstLocacao {

	public static void main(String[] args) {
		
		Locacao loc = new Locacao();
		loc.getDataInicio();
		loc.getDataFim();
		loc.getImovel();
		loc.getImovel().getEndereco();
		loc.getImovel().getValAluguel();
		loc.getImovel().getTipoMaterial();		
		
		
		loc.toString();
		

	}

}
