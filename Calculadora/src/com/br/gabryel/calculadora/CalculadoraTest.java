package com.br.gabryel.calculadora;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalculadoraTest {

	@Test(timeout = 200)
	public void testSomar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(5, 5);
		
		assertEquals(10, resultado);
	}

	@Test(expected = ArithmeticException.class)
	public void testDividirPorZeroExption() {
		Calculadora calculadora = new Calculadora();
		
		calculadora.dividir(10, 0);
	}
	
	@Test
	public void testSomarNumeroNegativo() {
		
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(-4, -6);
		assertTrue(-10 == resultado);
	}
	
	@Ignore
	public void testSomarSemAnnotation() {
		
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = calculadora.somar(5, 5);
				
		assertEquals(resultadoEsperado, resultado);
	}

}
