package atividade03;

public class Teste {

	public static void main(String[] args) {
		
		Passeio passeio1 = new Passeio(5);
		Passeio passeio2 = new Passeio(2);
		Passeio passeio3 = new Passeio(7);
		Passeio passeio4 = new Passeio(6);
		Passeio passeio5 = new Passeio(4);
		Carga carga1 = new Carga(5700,2390);	
		Carga carga2 = new Carga(9000,2700);
		Carga carga3 = new Carga(5700,2680);
		Carga carga4 = new Carga(6000,1590);
		Carga carga5 = new Carga(5000,1615);
		
		passeio1.setVelocMax(116.0f);
		passeio2.setVelocMax(300.0f);
		passeio3.setVelocMax(180.0f);
		passeio4.setVelocMax(200.0f);
		passeio5.setVelocMax(270.0f);
		
		carga1.setVelocMax(116.0f);
		carga2.setVelocMax(300.0f);
		carga3.setVelocMax(180.0f);
		carga4.setVelocMax(200.0f);
		carga5.setVelocMax(270.0f);			
		
		passeio1.toString();
		passeio2.toString();		
		passeio3.toString();		
		passeio4.toString();	
		passeio5.toString();		
		
		carga1.toString();
		carga2.toString();		
		carga3.toString();		
		carga4.toString();	
		carga5.toString();			

	}	

}
