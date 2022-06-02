package atividadeWebConfFaltantes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Locacao {
    
    private Calendar dataInicio = new GregorianCalendar(2022, 5, 25); 
    private Calendar dataFim = new GregorianCalendar(2022, 5, 28);
    private Imovel imovel = new Imovel();
    
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public Imovel getImovel() {
		return imovel;
	}
	
	@Override
	public String toString() {		
		
        System.out.println("Inicio da Locacao: " + this.dataInicio.get(dataInicio.DAY_OF_MONTH)+ "/" + this.dataInicio.get(dataInicio.MONTH)+ "/" + this.dataInicio.get(dataInicio.YEAR));
        System.out.println("Fim da Locacao: " + this.dataFim.get(dataFim.DAY_OF_MONTH) + "/" + this.dataFim.get(dataFim.MONTH) + "/" + this.dataFim.get(dataFim.YEAR) );
        System.out.println("Endereço do Imovel: " + this.imovel.getEndereco().getRua()+ ", num " + this.imovel.getEndereco().getNum()+ "," + this.imovel.getEndereco().getCidade().getNomeCid() );
        System.out.println("Valor do Aluguel: " + this.imovel.getValAluguel());
        System.out.println("Tipo do Material: " + this.imovel.getTipoMaterial());
        System.out.println("Proprietário: " + this.imovel.getProprietario().getNomeProp()+ "("+ this.imovel.getProprietario().getCpfProp()+")");
        System.out.println("Endereço do Proprietário: " + 
	        this.imovel.getProprietario().getEndereco().getRua() + ", num " +
	        this.imovel.getProprietario().getEndereco().getNum() + "," +
        	this.imovel.getProprietario().getEndereco().getCidade().getNomeCid()
        	);          
        System.out.println("************************************************************");
        return null;
	}

}
