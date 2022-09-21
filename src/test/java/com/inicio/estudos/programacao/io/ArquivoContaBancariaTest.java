package com.inicio.estudos.programacao.io;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.inicio.estudos.programacao.oo.objetos.conta.ArquivoContaBancaria;
import com.inicio.estudos.programacao.oo.objetos.conta.ContaBancaria;

public class ArquivoContaBancariaTest {
	
	Path path;
	ArrayList<ContaBancaria> contas;
	ArquivoContaBancaria operacao;

	@BeforeEach
	public void inicializaDiretorio() throws UnsupportedOperationException, IOException{
		contas = new ArrayList<>();
		contas.add(new ContaBancaria("Ricardo", 118.21));
		contas.add(new ContaBancaria("Paula", 210.21));
		contas.add(new ContaBancaria("lulu", 6500.21));
		contas.add(new ContaBancaria("Tiago", 100.21));
		
		path = Paths.get("c:/t/files/contas.txt");
		
		Files.createDirectories(path.getParent());
		operacao = new ArquivoContaBancaria();
	} 
	
	@Test
	public void deveArmazenarERecuperarContasArmazenadas() throws UnsupportedOperationException, IOException{
		operacao.armazenarContas(contas);
		assertEquals(4, operacao.recuperarContas().size());
	}
}