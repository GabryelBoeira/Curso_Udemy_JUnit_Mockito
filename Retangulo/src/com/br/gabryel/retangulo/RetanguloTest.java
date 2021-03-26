package com.br.gabryel.retangulo;

public class RetanguloTest {

	Retangulo retangulo;

	public boolean testCalcularArea() {

		int resultadoEsperado = 20;
		retangulo = new Retangulo(10, 2);

		return resultadoEsperado == retangulo.calcularArea();
	}

	public boolean testCalcularPerimetro() {
		
		int resultadoEsperado = 24;
		retangulo = new Retangulo(10, 2);

		return resultadoEsperado == retangulo.calcularPerimetro();
	}

}
