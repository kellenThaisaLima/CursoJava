package atividade01;

public class Teste {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setPlaca("11111");
		veiculo1.setMarca("Fiat");
		veiculo1.setModelo("Strada");
		veiculo1.setCor("Vermelho");
		veiculo1.setVelocMax(240.0f);
		veiculo1.setQtdRodas(4);
		veiculo1.getMotor().setQtdPist(4);
		veiculo1.getMotor().setPotencia(70);
		
		Veiculo veiculo2 = new Veiculo("22222", "Kia", "Cerato", "Prata", 260.0f, 4);
		veiculo2.getMotor().setQtdPist(4);
		veiculo2.getMotor().setPotencia(73);
		
		Veiculo veiculo3 = new Veiculo("33333", "VW", "Gol", "Preto", 180.0f, 4, 4, 74);
		
		Veiculo veiculo4 = new Veiculo("44444", "Jippe", "Renegade", "Verde", 250.0f, 4, 4, 95);
		
		Veiculo veiculo5 = new Veiculo("55555", "GM", "Onix", "Azul", 250.0f, 4, 4, 80);
		
		veiculo1.toString();
		veiculo2.toString();		
		veiculo3.toString();		
		veiculo4.toString();		
				
		System.out.println("Placa: " + veiculo5.getPlaca());
        System.out.println("Marca: " + veiculo5.getMarca());
        System.out.println("Modelo: " + veiculo5.getModelo());
        System.out.println("cor: " + veiculo5.getCor());
        System.out.println("velocMax: " + veiculo5.getVelocMax());
        System.out.println("qtdRodas: " + veiculo5.getQtdRodas());
        System.out.println("qtdPistMotor: " + veiculo5.getMotor().getQtdPist());
        System.out.println("potenciaMotor: " + veiculo5.getMotor().getPotencia());       
        System.out.println("************************************************************");		

	}	

}
