package javaa;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivo5 {

	
	public static void main(String[] args) throws IOException {
		//com isso vc consegue recuperar
		//para iterar os diretorios raiz do computador
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		//usando um forech vc pode percorer cada um desses diretorios raizes
		for (Path path : dirs) {
			System.out.println(path);
		}
		
		//LISTAR CONTEUDO DE UM DIRETORIO
		
		Path dir = Paths.get("c:/t");
		//recuperar uma strem de diretorios
		try(DirectoryStream<Path> stream =  Files.newDirectoryStream(dir)){
			for (Path path : stream) {
				System.err.println(path.getFileName());
			}	
		}catch(IOException | DirectoryIteratorException e){
			e.printStackTrace();
		}
		
		FileSystem fs = FileSystems.getDefault();
			for(FileStore store : fs.getFileStores()){
				System.out.println("Unidade: "+ store.toString());
				System.out.println("Total: "+ store.getTotalSpace());
				System.out.println("Disponível: "+ store.getUsableSpace());
				//total menos a quantidade disponivel
				System.out.println("Utilizada: "+ (store.getTotalSpace() - store.getUsableSpace()));
				System.out.println();
			}		
	}
}
