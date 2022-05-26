package atividadeWebConfFaltantes;

public class TstLocacao {

	public static void main(String[] args) {
		
		Cidade cid2 = new Cidade();
		cid2.setCodCid(2);
		cid2.setNomeCid("Araucaria");
		
		Endereco endereco2 = new Endereco();		
		endereco2.setRua("Rua das Flores");
		endereco2.setNum(2);
		endereco2.setCidade(cid2);
		
		Locacao loc = new Locacao();
		loc.getImovel().setEndereco(endereco2);
	
		
		
		loc.toString();
		

	}

}
