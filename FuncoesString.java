package curso;

public class FuncoesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String minusculas = original.toLowerCase(); //deixando todos os caracteres com letras minusculas
		String maiusculas = original.toUpperCase();//deixando todos os caracteres maisuculos.
		String espacos = original.trim();//Elimina os espaços nos cantos das strings
		String novoSubstring = original.substring(2);//neste caso pega a partir do segundo caracter gerando uma nova string
		String corteSubstring = original.substring(2, 9);//faz o corte do segundo caracter até o nono
		String trocaCaracter = original.replace("a", "x");//Neste caso substituindo o a minusculo por x
		String trocaSubstringReplace = original.replace("abc", "XYZ");//Mesma troca do anterior só que agora com conjuntos de caracteres
		int i = original.indexOf("bc");//Primeira vez que os caracteres bc aparecem na sequencia
		int j = original.lastIndexOf("bc");//Última vez que o bc apoarece na sequencia.
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Letras minusculas com o toLowerCase = -"+minusculas+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Letras maiusculas com o toUpperCase = -"+maiusculas+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Eliminando os espaços nos cantos das strings = -"+espacos+"-");
		
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Pegando a partir do segundo caracter = -"+novoSubstring+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Pegando a partir do segundo caracter até o nono = -"+corteSubstring+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Substituindo o 'a' minusculo por x = -"+trocaCaracter+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Substituindo o 'abc' por 'XYZ' = -"+trocaSubstringReplace+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("primeira posição de bc = -"+i+"-");
		
		System.out.println("");
		
		System.out.println("Valor inicial da string sem conversões: -"+original+"-");
		System.out.println("Última posição de bc = -"+j+"-");
	}

}
