package curso_programacao;

import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//lendo palavras
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		*/
		
		/*
		//lendo números inteiros
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		*/
		
		/*
		//lendo números reais
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		*/
		
		/*
		//lendo caracteres
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		*/

		//lendo dados na mesma linha
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
