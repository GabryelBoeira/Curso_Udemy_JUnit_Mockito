package com.br.gabryel.livraria.repository;

import com.br.gabryel.livraria.model.Pilha;

public class PilhaRepositoryImpl implements PilhaRepository {

	//Simula a camada de comunicação com banco de dados 
	
	@Override
	public void save(Pilha pilha) {
		System.out.println("Salvou");
	}	
}