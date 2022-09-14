package javaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	
	public static void main(String[] args) throws IOException {
		/*
		//CHECK == VERIFICAR OS ARQUIVOS
		Path path = Paths.get("c:/t/files/texto.txt");
		System.out.println("existe caminho = " + Files.exists(path));
		System.out.println("existe diretorio = " + Files.isDirectory(path));
		
		//arquivo como uma imagem texto, e um arquivo como a gente conhece
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isReadable(path));
		//verificar se e executavel
		System.out.println(Files.isExecutable(path));
		//tamanho do arquivo
		System.out.println(Files.size(path));
		//para saber a ultima modificação
		System.out.println(Files.getLastModifiedTime(path));
		//para saber quem e o administrador da maquina
		System.out.println(Files.getOwner(path));
		//retorna o tipo de arquivo
		System.out.println(Files.probeContentType(path));
		
		
		//DELETE
		//Files.delete(path);//esse so consegue deletar o diretorio se ele estiver vazio 
		//deleta so se existir o arquivo
		Files.deleteIfExists(path);
		*/
		
		//CREATE
		Path path = Paths.get("c:/t/files/texto2.txt");
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path, "meu texte de novo".getBytes());
		
		//COPY
		//UMA COPIA E UM NOVO DESTINO
		Path copia = Paths.get("c:/t/files/copia.txt");
		//opçoes de copia estao dentro da StandardCopyOption
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		//MOVER
		Path mover = Paths.get("c:/t/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
