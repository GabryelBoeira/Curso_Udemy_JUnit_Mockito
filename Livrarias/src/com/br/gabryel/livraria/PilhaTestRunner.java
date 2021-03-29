package com.br.gabryel.livraria;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PilhaTestRunner {

	public static void main(String[] args) {
		
		Result resultado = JUnitCore.runClasses(LivroTest.class);
		
		List<Failure> falhas = resultado.getFailures();
		
		if(falhas.size() > 0) {
			for(Failure falha: falhas) {
				System.out.println("Erro em : " + falha.getDescription() + "\nmessagem: "+  falha.getMessage());
			}			
		}
		
		System.out.println("\n"+"Resultado dos Testes: " + resultado.wasSuccessful());
	}

}
