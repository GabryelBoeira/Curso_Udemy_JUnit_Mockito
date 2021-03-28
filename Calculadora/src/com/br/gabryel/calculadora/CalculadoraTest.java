package com.br.gabryel.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(5, 5);
		assertEquals(10, resultado, "Sucesso");
	}
	
	@Ignore
	public void testSomarSemAnnotation() {
		
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.somar(5, 5);
				
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testSomarNumeroNegativo() {
		
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = -10;
		
		int resultado = calculadora.somar(-4, -6);
		
		assertTrue(resultadoEsperado == resultado, "Sucesso");
	}
	
	
}
