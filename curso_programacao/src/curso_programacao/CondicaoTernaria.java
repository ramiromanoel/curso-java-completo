package curso_programacao;

public class CondicaoTernaria {

	public static void main(String[] args) {
		
		double preco = 18;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		
		System.out.println(desconto);

	}

}
