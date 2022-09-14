package javaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import oo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("c:/t/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	//METODO PARA ARMAZENAR CONTA
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				writer.write(conta.getCliente() + ";"+ conta.getSaldo() + "\n");
			}
		}
	}
	
	//método para recuperar as contas
	public ArrayList<Conta> recuperarContas() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				String[] t = line.split(";");
				//System.out.println(t[0] + t[1]);
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
	return contas;
	}
	
	
	public static void main(String[] args) throws IOException {
	
		/*
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 118.21));
		contas.add(new Conta("Paula", 210.21));
		contas.add(new Conta("lulu", 6500.21));
		contas.add(new Conta("Tiago", 100.21));
*/
		
		//CHAMAR O METODO que armazena as contas
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
		
	}

}
