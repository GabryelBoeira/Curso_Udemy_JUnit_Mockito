package com.br.gabryel.venda.model;

import com.br.gabryel.venda.service.CreditoService;

public class Venda {

	private Cliente cliente;
	private double valor;
	private CreditoService creditoService;

	private boolean pagamentoAVista = true;

	public Venda(double valor, Cliente cliente, CreditoService creditoService) {
		this.cliente = cliente;
		this.valor = valor;
		this.creditoService = creditoService;
	}

	public boolean checkout() {

		if (this.pagamentoAVista)
			return true;

		try {
			
			double limite = creditoService.getLimiteCredito(cliente.getCpf());
			return valor < limite;
		} catch (RuntimeException e) {
			
			return false;
		}
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the pagamentoAVista
	 */
	public boolean isPagamentoAVista() {
		return pagamentoAVista;
	}

	/**
	 * @param pagamentoAVista the pagamentoAVista to set
	 */
	public void setPagamentoAVista(boolean pagamentoAVista) {
		this.pagamentoAVista = pagamentoAVista;
	}
}
