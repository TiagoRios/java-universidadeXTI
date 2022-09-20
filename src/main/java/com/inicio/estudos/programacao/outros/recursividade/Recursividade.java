package com.inicio.estudos.programacao.outros.recursividade;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	public int somaRecursiva(int valor) {
		if (valor == 0) {
			return valor;
		} else {
			return valor + somaRecursiva(valor - 1);
		}
	}

	public int potenciaComRecursividade(int base, int expoente) {
		if (expoente == 1) {
			return base;
		} else {
			return base * potenciaComRecursividade(base, expoente - 1);
		}
	}

	/**
	 * metodo que lista os diretorios de um caminho passado
	 * 
	 * @param path caminho/directory que desejas listar
	 * @throws IOException
	 */
	public static void listar(Path path) throws IOException {
		if (Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			DirectoryStream<Path> stream = Files.newDirectoryStream(path);
				for (final Path p : stream) {
					listar(p);
				}
		}
	}

	public static void main(String[] args) throws IOException {
		Recursividade.listar(Paths.get("d:/"));
	}
}
