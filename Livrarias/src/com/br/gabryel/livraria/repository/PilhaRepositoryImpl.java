package com.br.gabryel.livraria.repository;

import com.br.gabryel.livraria.model.Pilha;

public class PilhaRepositoryImpl implements PilhaRepository {

	//Simula a camada de comunica��o com banco de dados 
	
	@Override
	public void save(Pilha pilha) {
		System.out.println("Salvou");
	}	
}