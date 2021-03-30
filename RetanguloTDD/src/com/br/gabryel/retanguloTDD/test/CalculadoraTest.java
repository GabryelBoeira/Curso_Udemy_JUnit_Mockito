package com.br.gabryel.retanguloTDD.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.gabryel.retanguloTDD.Retangulo;

class CalculadoraTest {

	@Test
	void testCalcularArea() {
		
		Retangulo retangulo = new Retangulo();
		int a = 10, b = 2, resultadoEsperado = 20;
		
		int resultado = retangulo.calcularArea(b, a);
		
		assertEquals(resultadoEsperado, resultado);
	}

}
