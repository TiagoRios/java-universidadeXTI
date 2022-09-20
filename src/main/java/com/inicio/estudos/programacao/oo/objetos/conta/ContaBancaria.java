package com.inicio.estudos.programacao.oo.objetos.conta;

public class ContaBancaria implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// PARA NAO ARMAZENAR UMA VARIAVEL DE OBJETO USA-SE A PALAVRA "transient"
	// QUANDO DEVE-SE USAR UM MODIFICADOR TRANSIENT? quando estiver serializando
	// um ojeto que tenha a senha de um usuario do sistema ou outra informa�ao que
	// nao pode ser visualizada
	private String cliente;
	private transient double saldo;

	// CONSTRUTOR com public para poder chamar em outro lugar
	public ContaBancaria() {
	}

	public ContaBancaria(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public String exibeSaldo() {
		return cliente + " Seu saldo e: " + saldo;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public void trasferePara(ContaBancaria destino, double valor) {
		// usei o this para fazer referencia a classe conta
		this.saca(valor);
		destino.deposita(valor);
	}
}
