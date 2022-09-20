package com.inicio.estudos.programacao.threads;

public class PonteNaoSincronizada implements Ponte {

	private int valor = -1;
	
	@Override
	public void set(int valor) throws InterruptedException {
		System.out.print("produziu "+ valor);
		this.valor = valor;
		
	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("consumidor "+ valor);
		return valor;
	}

}
