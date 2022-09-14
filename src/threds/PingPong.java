package threds;

//criando uma thread chamada pingPong
public class PingPong extends Thread{

	String palavra;
	long tempo;
	
	//construtor
	//thread com uma palavra e um tempo definido
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}

	//definindo o metodo run para executar a minha thread
	//a sleep vai gerar uma exception
	//thread usada pela virtual machine quando ela executa um metodo run
	public void run(){
		try {
		//colocar para imprimir 5 vezes
			for (int i = 0; i < 5; i++) {
			System.out.println(palavra);
			//Sleep e um metodo estatico da classe threads
			//Sleep coloca a thread para esperar/aguarda que o tempo que eu defini passe para poder ser executada novamento
			Thread.sleep(tempo);
		}
			} catch (InterruptedException e) {
				return;
			}
		}
	
	public static void main(String[] args) {
		
		//criando duas threads
		//as theads vao para o modo pronto para ser usudao
		new PingPong("ping", 500).start();//executar do metodo start para as threads irem para o estado de ser executado
		new PingPong("PONG", 2000).start();
		
	}

}
