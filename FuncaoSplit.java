package curso;

public class FuncaoSplit {

	public static void main(String[] args) {
		String frutas = "Banana Ma�� Abacaxi"; //string que esta recebendo 3 valores
		
		String [] conjunto = frutas.split(" ");//Neste caso usamos um vetor no string frtutas com par�metro o espa�o em branco
		System.out.println(conjunto[0]);//Aqui imprimento o vetor na posi��o 2 (Banana)
		System.out.println(conjunto[1]);//Aqui imprimento o vetor na posi��o 2 (Ma��)
		System.out.println(conjunto[2]);//Aqui imprimento o vetor na posi��o 2 (Abacaxi)
	}

}
