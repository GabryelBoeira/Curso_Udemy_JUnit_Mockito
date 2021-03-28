package com.br.gabryel.calculadora;

public class Calculadora {
	
	public int somar(int a, int b) {
		
		int x= 10;
		
		//Forçar atraso para gerar timeOut
		while (x > 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			x--;
		}
		
		return a + b;
	}

	public int dividir(int a, int b) {
		if (b == 0) throw new ArithmeticException();
	
		return a/b;
	}
}
