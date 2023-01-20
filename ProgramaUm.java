package curso;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaUm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		String nome;
		System.out.println("informe seu nome: ");
		nome = sc.next();
		sc.close();
		
		System.out.printf("Muito bem Vindo %s não tenha medo de lutar!",nome);

	}

}
