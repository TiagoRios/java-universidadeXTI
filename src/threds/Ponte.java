package threds;

public interface Ponte {

	public void set(int valor) throws InterruptedException;
	//recuperar informação
	public int get()throws InterruptedException;
	
}
