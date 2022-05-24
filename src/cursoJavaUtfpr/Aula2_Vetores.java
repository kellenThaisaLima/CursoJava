package cursoJavaUtfpr;

import java.util.Scanner;

public class Aula2_Vetores {

	public static void main(String[] args) {	
		
		
		int valores;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		
		valores = teclado.nextInt();		
		
		int vetor[] = new int[valores];
		
		
		
		for (int i = vetor.length -1 ; i >= 0; i--) {
			
			if (vetor[i] == 0) {
				
				vetor[i] = valores;
				
				valores = valores -1;
				
			};
			
			System.out.println(vetor[i]);
		}
		
		
		
		
		
		teclado.close();

	}

}
