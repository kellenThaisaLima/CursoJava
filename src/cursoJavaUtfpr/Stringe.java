package cursoJavaUtfpr;

import java.util.Scanner;

public class Stringe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com uma frase:");
		
		String frase = teclado.nextLine();
		
		System.out.println("Escolha uma letra:");
		
		String letra = teclado.nextLine();	
		
		char b[] = letra.toCharArray();
		
		int contaChar = 0;
		
		char tmp;		
		
		if (frase.contains(letra)){
			
			for (int i = 0; i < frase.length(); i++) {
				
				tmp = frase.charAt(i);
				
				if (tmp == (b[0])) {
					
					contaChar++;					
				}
			}
			
		System.out.println(" A letra '" + letra + "' aparece " + contaChar + " vezes na frase: '" + frase + "'");
			
		} else {
			
			System.out.println("A frase não contem a letra :" + letra);
		}		
		
		teclado.close();

	}

}
