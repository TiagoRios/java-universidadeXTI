package javaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args){
	
		Path path = Paths.get("c:/t/files/texto.txt");
		//codificaçao charset utf8; objeto charset
		Charset utf8 = StandardCharsets.UTF_8;
		//retorna um objeto tipo bufferedwrite strem para manipulaçao arquivos com caracteres
		
		/*ESCRITA DE ARQUIVO
		 * BufferedWriter w = null;
		
		try{
			w = Files.newBufferedWriter(path, utf8);
		    //pode se escrever quantas vezes quiser.
			w.write("Texto numero um\n");
		    w.write("Texto numero dois\n");
			//para gravar as linhas de texto.
		    w.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(w != null){
				//para fechar a ligaçao com o arquivo
				w.close();
			}
		}
		*/
		//ESCRITA DE ARQUIVO NOVO GEITO
		//NOVO GEITO DE FAZER A PARTIR DO JAVA 7.
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			
		    //pode se escrever quantas vezes quiser.
			w.write("Texto numero um\n");
		    w.write("Texto numero dois\n");
			//para gravar as linhas de texto.
		    w.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
		/*LEITURA DE ARQUIVOS*/
		//SE ESTIVER TRABALHANDO COM ARQUIVOS LONGOS DE TEXTO OU CARACTERES USE BUFFEREDWRITE
		//SE ESTIVER TRABALHANDO COM ARQUIVOS PEQUENOS USE O DA AULA ANTERIOR
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			//CHAMA SEMPRE A MESMA LINA READLINE
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			}catch(IOException e){
				e.printStackTrace();
		}
	}
}
