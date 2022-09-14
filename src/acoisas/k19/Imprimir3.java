package acoisas.k19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Imprimir3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream arquivo = new FileOutputStream("meu.txt");
		PrintStream printStream = new PrintStream(arquivo);

		printStream.println(" Primeira linha !!! ");
		printStream.println(" Segunda linha !!! ");
		printStream.println(" Terceira linha !!! ");

		printStream.close();
	}

}
