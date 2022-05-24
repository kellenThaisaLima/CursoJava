package cursoJavaUtfpr;

public class Aula4 {

	 public static class Pessoa {
		 int rg;
		 String nome; 
		 
		Pessoa(){					// método construtor
			 rg = 100;
			 nome = "Paz";
			 }
		 
		public void insereDados(){
			 int id = 1;
			 String apelido ="Jesus";
			 rg=id;
			 nome=apelido;
		 }
		 
		public void mostraDados(){
			 
			 System.out.println("\n RG: "+rg);
			 System.out.println("\n Nome: "+nome);
			 
		 }	
		 
		public static void main(String arg[]){
					 
			 Pessoa p = new Pessoa();
//			 p.insereDados();
			 p.mostraDados();
		 
		 }
		 
	 }	
}
