package com.inicio.estudos.programacao.threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args){
		//usar o objeto runnable para iniciar varias threads
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras, "pai").start();
		new Thread(irAsCompras, "m�e").start();
		new Thread(irAsCompras, "filha").start();
		new Thread(irAsCompras, "filho").start();
		
	
	}
	
	@Override
	public void run() {
		//recuperar a thread que esta em execu�ao e atraves dela pego o nome do cliente
		String cliente = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
		conta.sacar(20, cliente);
		if (conta.getSaldo()< 0 ) {
			System.out.println("estourou");
			}
		}
	}

}
