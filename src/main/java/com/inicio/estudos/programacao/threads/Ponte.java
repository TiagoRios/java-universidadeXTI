package com.inicio.estudos.programacao.threads;

public interface Ponte {

	public void set(int valor) throws InterruptedException;
	//recuperar informa��o
	public int get()throws InterruptedException;
	
}
