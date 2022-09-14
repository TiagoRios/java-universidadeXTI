package logica;
//entrada de dados com Scanner.
import java.util.Scanner;

public class Entrada {
	private static Scanner s;

	public static void main(String[] args) {
		// System.out.println(args[0]);

		s = new Scanner(System.in);
		System.out.println("qual seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);

	}
}