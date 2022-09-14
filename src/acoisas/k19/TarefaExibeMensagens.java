package acoisas.k19;

public class TarefaExibeMensagens implements Runnable {

	private String msg;

	public TarefaExibeMensagens(String msg) {
		this.msg = msg;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + " : " + this.msg);
		}
	}
}