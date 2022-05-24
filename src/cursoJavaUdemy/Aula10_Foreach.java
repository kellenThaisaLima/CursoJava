package cursoJavaUdemy;

public class Aula10_Foreach {

	public static void main(String[] args) {
		String nome = "Geek University";
		
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
		}

	}

}
