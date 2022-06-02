package atividade03;

import atividade01.Teste;

final public class Carga extends Veiculo {
	
	private int cargMax;
	private int tara;
	
	public Carga() {
		
		this.cargMax = 0;
		this.tara = 0;
		
	};
	
	public Carga(int cargMax, int tara) {
		
		this.cargMax = cargMax;
		this.tara = tara;
	};	
	
	

	public int getCargMax() {
		return cargMax;
	}

	final public void setCargMax(int cargMax) {
		this.cargMax = cargMax;
	}

	public int getTara() {
		return tara;
	}

	final public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	float calcVel(float velocMax) {
		float parseMetros = this.getVelocMax()/100000;
		return parseMetros;
	}

	@Override
	public String toString() {			
		super.setPlaca("55555");
		super.setMarca("Ford");
		super.setModelo("F-350 EUROMEC");
		super.setCor("Branco");		
		super.setQtdRodas(4);	
		super.getMotor().setQtdPist(16);
		super.getMotor().setPotencia(150);
		System.out.println("Veículo de Carga: " + hashCode());
        System.out.println("Carga Máxima: " + this.cargMax);
        System.out.println("Tara: " + this.tara);  
        System.out.println("A velocidade do veículo de carga é " + this.calcVel(getVelocMax()) + " cm/h"); 
        System.out.println("************************************************************");        
		return null;
	}
	
	
	
	

}
