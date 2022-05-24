// Funções
package cursoJavaUdemy;

import java.util.Scanner;

public class Aula11 {

	public static void main(String[] args) {
		int qtd;
		String frutas[];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("quantidade de frutas: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		frutas = new String[qtd];
		
		for(int i = 0;i < qtd; i++) {
			System.out.println("Informe a " + (i + 1) +  " fruta:");
			frutas[i] = teclado.nextLine();
		}
			
		for(int i = 2; i < qtd; i--) {
			System.out.println(frutas[i]);			
		}
		
		teclado.close();

	}

}
