package com.br.gabryel.calculadora;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a + b;
	}

	public int dividir(int a, int b) {
		if (b == 0) throw new ArithmeticException();
	
		return a/b;
	}
}
