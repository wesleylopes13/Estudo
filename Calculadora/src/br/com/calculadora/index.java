package br.com.calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1 = 45, n2 = 5;
		int esc = 21;
		
				//Instanciando classe
		Operacoes operacao = new Operacoes();
		
		operacao.setNum1(n1);
		operacao.setNum2(n2);
		
		operacao.setEscolha(esc);
		
		operacao.matematica();
		
	}

}
