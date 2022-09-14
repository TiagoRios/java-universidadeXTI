package javaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
	
	public static void main(String[] args) throws IOException {
		//forma de manipular arquivos apartir do java7
		//CAMINHHO PARA GRAVAR O TEXTO
		Path path = Paths.get("c:/t/files/texto.txt");
		System.out.println("caminho absoluto: "+path.toAbsolutePath());
		System.out.println("diretorio parent: "+path.getParent());
		System.out.println("Raiz: "+path.getRoot());
		System.out.println("nome arquivo: "+path.getFileName());
	
		/*CRIAÇÃO DE DIRETORIOS*/
		Files.createDirectories(path.getParent());
	   
		/*ESCREVER E LER ARQUIVOS*/
		byte[]  bytes = "meu texto".getBytes();
		Files.write(path, bytes);//cria, limpa e escreve o texto dentro do arquivo
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String("texto retornado: " + retorno));
	}
}
