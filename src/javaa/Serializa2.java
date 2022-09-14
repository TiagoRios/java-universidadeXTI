package javaa;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import oo.Conta;

public class Serializa2 {
	
	//METODO PARA ARMAZENAR CONTA
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		
		//PEGUEI ESSES CODIGOS NO SERIALIZA.
		try(FileOutputStream fos = new FileOutputStream("c:/t/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("c:/t/files/contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				//gravou o objeto arraylist inteiro entao pode retorna esse objeto
				return ((ArrayList<Conta>) ois.readObject());
			
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 118.21));
		contas.add(new Conta("Paula", 210.21));
		contas.add(new Conta("Thayna", 6500.21));
		contas.add(new Conta("Tiago", 100.21));

		//CHAMAR O METODO que armazena as contas
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
		
	}

}
