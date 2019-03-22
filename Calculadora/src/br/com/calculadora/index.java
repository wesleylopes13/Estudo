package br.com.calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarando variaveis para operacao ser realizada
		float n1 = 45, n2 = 5;
		int esc = 3;
		
		//Instanciando classe
		Operacoes operacao = new Operacoes();
		
		// Inserindo dados nas variaveis e enviando para classe
		operacao.setNum1(n1);
		operacao.setNum2(n2);
		
		// Inserindo operacao a ser realizada
		operacao.setEscolha(esc);
		
		// mostra resultado
		operacao.matematica();
		
	}

}
