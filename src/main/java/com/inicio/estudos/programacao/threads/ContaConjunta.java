package com.inicio.estudos.programacao.threads;

public class ContaConjunta {

	private int saldo = 100;
	public int getSaldo(){
		return saldo;
	}
	
	/**
	 * metodo que simula uma opera��o de saque
	 * @param valor
	 * @param cliente
	 */
	public synchronized void sacar(int valor, String cliente){
		
		if(saldo >= valor){
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				
				System.out.println(cliente + " esperando");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//aguarda o processamento da solicita�ao de saque
			saldo -= valor;
			String msg = cliente + " Sacou "+ valor + " [saldo originial=" + saldoOriginal  + ", Saldo final=" + saldo +  "]";
			System.out.println(msg); 
		}else{
			System.out.println("Saldo insuficiente para "+ cliente);
		}
	}
}
