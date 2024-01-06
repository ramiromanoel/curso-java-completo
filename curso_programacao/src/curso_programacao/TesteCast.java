package curso_programacao;

public class TesteCast {

	public static void main(String[] args) {
		
		//exemplo trapézio
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2f * h;
		System.out.println(area);
		
		//exemplo 
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = a / c; //sem cast
		System.out.println(resultado);

		resultado = (double) a / c; //com cast
		System.out.println(resultado);
		
	}

}
