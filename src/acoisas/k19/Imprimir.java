package acoisas.k19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Imprimir {

	public static void main(String[] args) {

		try {
			//InputStream teclado = System.in;
			//Scanner scannerTeclado = new Scanner(teclado);

			FileInputStream arquivo = new FileInputStream("meu.txt");
			Scanner scannerArquivo = new Scanner(arquivo);

			System.out.println(scannerArquivo);

		}catch(FileNotFoundException x){
			x.printStackTrace();
		} catch (Exception e) {
			System.out.println("este foi o erro:\n" + e.getMessage());
			e.printStackTrace();
		}// fim do catch

	}// fim do metódo principal
}//fim da classe
