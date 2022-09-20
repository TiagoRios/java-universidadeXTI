package com.inicio.estudos.programacao.threads;

import java.util.Random;

public class Consumidor implements Runnable {

	private Ponte ponte;
	public Consumidor(Ponte ponte){
		this.ponte = ponte;
	}
	
	//classe que determina coisas aleatorias
	private Random random = new Random(); 
	
	
	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));//aguardar um periodo de tempo aleatorio
				total += ponte.get();  //ler informa��es da ponte
				//ponte.set(i); incluir
				System.err.println("\t"+total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
