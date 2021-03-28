package com.br.gabryel.livraria;

import java.util.ArrayList;
import java.util.List;

public class Pilha {

	private static final int limite = 5;
	private List<Livro> livros = new ArrayList<>();

	public void push(Livro livro) {
		if (livros.size() >= limite) return;
		
		if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O")) return; 
		
		this.livros.add(livro);
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
