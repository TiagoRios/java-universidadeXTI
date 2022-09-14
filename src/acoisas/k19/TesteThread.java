package acoisas.k19;

public class TesteThread {

	public static void main(String[] args) {
	
	TarefaExibeMensagens tarefa1 = new TarefaExibeMensagens("eu ");
	TarefaExibeMensagens tarefa2 = new TarefaExibeMensagens("com");
	TarefaExibeMensagens tarefa3 = new TarefaExibeMensagens("voce");
	
	Thread thread1 = new Thread(tarefa1);
	Thread thread2 = new Thread(tarefa2);
	Thread thread3 = new Thread(tarefa3);
	
	thread1.start();
	thread2.start();
	thread3.start();

		System.out.println("ois");
	}
}
