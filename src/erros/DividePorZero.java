package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {

		System.out.print("numero: ");
		int a = s.nextInt();
		System.out.print("divisor: ");
		int b = s.nextInt();

		System.out.println("resultado : " + a / b);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			try {
				dividir(s);
				//continua = false;
			} catch (InputMismatchException | ArithmeticException e1) {
				System.err.println("numero invalido");
				s.nextLine();// descarta a entrada errada e libera a entrada
								// novamente para o usuario
				e1.getMessage();
			}
			finally {
				System.out.println("executada a ação\n");
			}
		} while (continua);
	}
}
