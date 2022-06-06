package atividade03;

final public class Passeio extends Veiculo{
	
	private int qtdPassageiros;
	
	public Passeio() {
		
		this.qtdPassageiros = 0;
	};
	
	public Passeio(int qtdPassageiros) {
		
		this.qtdPassageiros = qtdPassageiros;
	};
	

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	final public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	float calcVel(float velocMax) {
		float parseMetros = getVelocMax()*1000;
		return parseMetros;
	}

	@Override
	public String toString() {
		super.setPlaca("55555");
		super.setMarca("Fiat");
		super.setModelo("Uno");
		super.setCor("Vermelho");		
		super.setQtdRodas(4);
		super.getMotor().setQtdPist(4);
		super.getMotor().setPotencia(70);
		System.out.println("Veículo de Passeio: " + hashCode());
        System.out.println("QtdPassageiros: " + this.qtdPassageiros);      
        System.out.println("A velocidade do veículo de carga é " + this.calcVel(getVelocMax()) + " m/h"); 
        System.out.println("************************************************************");        
        return " Veículo de Passeio: " + hashCode();
	}
	
	
	
	
	
	

}
