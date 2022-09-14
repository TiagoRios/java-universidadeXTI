package threds;

public class PonteSincronizada implements Ponte{

	private int valor = -1;
	private boolean ocupada = false;

	//os produtores executar um de cada vez o metodo set
	public synchronized void set(int valor) throws InterruptedException {	
		//quando a condiçao nao for mais verdadeira pode executar a inclusao da informaçao usando este metodo 
		while (ocupada) {
			System.out.print("ponte cheia. Produtor aguarda...");
			//metodo para fazer a thread que estiver executando este metodo aguarde
			//quando nao pode ser executado enquando nao estiver ocupada
			wait();
		}
		
		System.out.print("produziu "+ valor);
		this.valor = valor;
		
		//informa que a classe esta ocupada novamente;
		ocupada = true;
		//notifica as thread que estao aguardando a modificação do estatus mudou ou nao(ocupado ou desocupado
		notifyAll();
	}

	//os consumidores executar um de cada vez o metodo get
	public synchronized int get() throws InterruptedException {
		while (!ocupada) {
			System.out.print("ponte vazia. Consumidor aguada...");
			wait();
		}
		System.err.print("consumidor "+ valor);
		ocupada = false;
		notifyAll();
		return valor;
	}

}
