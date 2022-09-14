package acoisas.k19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Imprimir2 {
	public static void main(String[] args) throws IOException {
		InputStream arquivo = new FileInputStream("meu.txt");
		Scanner scanner = new Scanner(arquivo);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
	}
}
