package com.inicio.estudos.programacao.oo.objetos.conta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArquivoContaBancaria {
	
	private Path path = Paths.get("c://t//files//contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;

	public void inicializaDiretorio() throws UnsupportedOperationException, IOException{
		Files.createDirectories(path.getParent());
	} 


	//METODO PARA ARMAZENAR CONTA
	public void armazenarContas(ArrayList<ContaBancaria> contas) throws IOException{
		inicializaDiretorio();
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (ContaBancaria conta : contas) {
				writer.write(conta.getCliente() + ";"+ conta.getSaldo() + "\n");
			}
		}
	}
	//m�todo para recuperar as contas
	public ArrayList<ContaBancaria> recuperarContas() throws IOException{
		ArrayList<ContaBancaria> contas = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				String[] t = line.split(";");
				ContaBancaria conta = new ContaBancaria(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
	return contas;
	}
	public static void main(String[] args) throws IOException {
		
		ArrayList<ContaBancaria> contas = new ArrayList<>();
		contas.add(new ContaBancaria("Ricardo", 118.21));
		contas.add(new ContaBancaria("Paula", 210.21));
		contas.add(new ContaBancaria("lulu", 6500.21));
		contas.add(new ContaBancaria("Tiago", 100.21));

		
		//CHAMAR O METODO que armazena as contas
		ArquivoContaBancaria operacao = new ArquivoContaBancaria();
		operacao.armazenarContas(contas);
		ArrayList<ContaBancaria> contas2 = operacao.recuperarContas();
		for (ContaBancaria conta : contas2) {
			conta.exibeSaldo();
		}
	}
}