package com.br.gabryel.livraria.mock;

import com.br.gabryel.livraria.model.Pilha;
import com.br.gabryel.livraria.repository.PilhaRepository;

public class TestPilhaRepository implements PilhaRepository {

	@Override
	public void save(Pilha pilha) {
		System.out.println("N�o Comunico com banco de dados");
	}
}
