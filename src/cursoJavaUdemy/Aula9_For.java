package cursoJavaUdemy;

import java.util.Scanner;

public class Aula9_For {

	public static void main(String[] args) {
		int idade = 1;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
			System.out.println(nome + " tem " + idade + " anos");
			}
	}
		
	teclado.close();

	}

}
