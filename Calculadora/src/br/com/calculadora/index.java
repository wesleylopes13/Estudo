package br.com.calculadora;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// Declarando classe Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Declarando variaveis para operacao ser realizada		
		float n1 = 0, n2 = 0;
		int esc = 0;
		
		System.out.printf("Calculadora simples\n");
		
		// Inserindo valores nas variaveis
		System.out.printf("Insira o primeiro número: ");
		n1 = teclado.nextFloat();
		
		System.out.printf("\nInsira o segundo número: ");
		n2 = teclado.nextFloat();
		
		System.out.printf("\nInsirida qual operação quer realizar: \n"
				+ "1 = Adição\n"
				+ "2 = Subtração\n"
				+ "3 = Divisão\n"
				+ "4 = Multiplicação\n");
		esc = teclado.nextInt();
		
		
		//Instanciando classe
		Operacoes operacao = new Operacoes();
		
		// enviando para classe
		operacao.setNum1(n1);
		operacao.setNum2(n2);
		operacao.setEscolha(esc);
		
		// Inserindo operacao a ser realizada
		operacao.setEscolha(esc);
		
		System.out.printf("\n\n");
		
		// mostra resultado
		operacao.matematica();
		
		// fechando classe Scanner
		teclado.close();
				
	}
}
