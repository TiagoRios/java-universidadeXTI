package refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	public static int soma(int x){
		if (x ==0) {
			return x;
		}else {
			System.out.println(x);
			return x + soma(x-1);
		}
	}
	
	public static int potencia(int x, int e){
		if (e == 1) {
			System.out.println("chegou fim = "+x);
			return x;
		}else {
			int y = x * potencia(x , e-1);
			System.out.println(y);
			return  y;		
		}
	}
	
	/**
	 * método que lista os diretorios de um caminho passado
	 * @param path caminho/directory que desejas listar
	 * @throws IOException
	 */
	public static void listar(Path path) throws IOException{
		if (Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		}else{
			String s = "\n"+ path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for (Path p : stream) {
					listar(p);
				}
			} catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) throws IOException {
		//System.out.println(soma(5));
		//System.out.println("final recursividade "+ potencia(2,3));
		listar(Paths.get("d:/"));
	}

}
