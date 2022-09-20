package com.inicio.estudos.programacao.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos {

	public void gravaNoArquivoTexto(String pathArquivo) throws FileNotFoundException {
		FileOutputStream arquivo = new FileOutputStream(pathArquivo);
		PrintStream printStream = new PrintStream(arquivo);

		printStream.println(" Primeira linha !!! ");
		printStream.println(" Segunda linha !!! ");
		printStream.println(" Terceira linha !!! ");

		printStream.close();
	}

	/**
	 * @return objeto com a lista de diretorios
	 */
	public Iterable<Path> listaDiretoriosRaiz() {
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		return dirs;
	}

	public void listarConteudoDiretorio(String diretorio) {
		// LISTAR CONTEUDO DE UM DIRETORIO
		Path dir = Paths.get(diretorio);
		// recuperar uma strem de diretorios
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path path : stream) {
				System.err.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
	}

	public void obterInformacoesSistemaDeArquivos() throws IOException {
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Total: " + store.getTotalSpace());
			System.out.println("Dispon�vel: " + store.getUsableSpace());
			// total menos a quantidade disponivel
			System.out.println("Utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));
			System.out.println();
		}
	}
}