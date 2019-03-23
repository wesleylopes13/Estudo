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
		System.out.printf("Insira o primeiro n�mero: ");
		n1 = teclado.nextFloat();
		
		System.out.printf("\nInsira o segundo n�mero: ");
		n2 = teclado.nextFloat();
		
		System.out.printf("\nInsirida qual opera��o quer realizar: \n"
				+ "1 = Adi��o\n"
				+ "2 = Subtra��o\n"
				+ "3 = Divis�o\n"
				+ "4 = Multiplica��o\n");
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
