package curso;

import java.util.Locale;
import java.util.Scanner;

public class IntrduzFuncoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Entre three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =  sc.nextInt();
		int calculaMaior = max(a,b,c);
		
		showResult(calculaMaior);
		

		sc.close();
	}
	
	//Criando a função max
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	//função pra imprimir resultado na tela showResult
	public static void showResult(int value) {
		
		System.out.println("Maior valor :"+value);
		
	}

}
