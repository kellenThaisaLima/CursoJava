package cursoJavaUtfpr;


import java.util.Scanner;


public class Aula2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		
		String s = "";
		s = teclado.nextLine();
		System.out.println("O valor de entradada foi: "+s);
		
		teclado.close();

	}

}