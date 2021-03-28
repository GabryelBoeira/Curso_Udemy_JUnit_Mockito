package com.br.gabryel.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomar() {
		
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.somar(5, 5);
		
		assertTrue(resultadoEsperado == resultado, "Sucesso");
	}
}
