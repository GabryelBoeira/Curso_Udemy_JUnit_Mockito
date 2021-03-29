package com.br.gabryel.livraria.model;

import java.util.ArrayList;
import java.util.List;

import com.br.gabryel.livraria.repository.PilhaRepository;

public class Pilha {

	private static final int limite = 5;
	private List<Livro> livros = new ArrayList<>();
	private PilhaRepository pilhaRepository;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	
	public Pilha(PilhaRepository pilhaRepository) {
		this.pilhaRepository = pilhaRepository;
	}

	public void push(Livro livro) {
		if (livros.size() >= limite)
			throw new ArrayStoreException();

		if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O"))
			return;

		this.livros.add(livro);
		pilhaRepository.save(this);
	}

	public Livro pop() {
		Livro livro = this.livros.get(livros.size() - 1);
		this.livros.remove(livro);

		return livro;
	}

	public int count() {
		return this.livros.size();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
