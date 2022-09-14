package javaa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import oo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Conta conta1 = new Conta("Natan", 1_222_333);
		
		
		//ESCRITA DE OBJETOS
		//FileOutputStream manipulaçao com bytes
		FileOutputStream fos = new FileOutputStream("c:/t/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.close();
	
		//LEITURA DE OBJETO
		FileInputStream fis = new FileInputStream("c:/t/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		ois.close();
	
		c1.exibeSaldo();
	}
	
}
