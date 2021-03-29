package com.br.gabryel.livraria.repository;

import com.br.gabryel.livraria.model.Pilha;

public interface PilhaRepository {

	//Simula a camada de comunicação com banco de dados 
	
	void save(Pilha pilha);

}