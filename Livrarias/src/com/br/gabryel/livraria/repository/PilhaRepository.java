package com.br.gabryel.livraria.repository;

import com.br.gabryel.livraria.model.Pilha;

public interface PilhaRepository {

	//Simula a camada de comunica��o com banco de dados 
	
	void save(Pilha pilha);

}