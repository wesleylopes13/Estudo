package br.com.calculadora;
import java.text.DecimalFormat;

public class Operacoes {
	
	private int escolha;
	private int operacao;	// Criando variaveis para operacoes matematicas
	DecimalFormat df = new DecimalFormat("0.00");
	private float num1, num2; 	// Criando variaveis para introducao dos numeros
	
	public Operacoes() {
		super();
		this.escolha = escolha;
		this.operacao = operacao;
		this.df = df;
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	// Método para validar qual escolha matematica foi requisitada e realizar operacao
	void matematica () {
		this.operacao = this.escolha;
		
		// Verifica qual operacao foi escolhida
		switch(this.operacao) {
		case 1:
			System.out.println("A soma de: " + getNum1() + " + " + getNum2() + " = " + df.format(getNum1()+getNum2()));
			break;
		case 2:
			System.out.println("A soma de: " + num1 + " - " + num2 + " = " + df.format(getNum1()-getNum2()));
			break;
		case 3:
			System.out.println("A soma de: " + getNum1() + " / " + getNum2() + " = " + df.format((getNum1()/getNum2())));
			break;
		case 4:
			System.out.println("A soma de: " + getNum1() + " x " + getNum2() + " = " + df.format(getNum1()*getNum2()));
			break;
		default: 
			System.out.print("\nEssa operação ainda não foi introduzida no programa\n");
			break;
			
		}
	}
}
