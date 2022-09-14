package erros;

public class Assertions {


//	private static Scanner s;

	public static void main(String[] args) {
		
//		s = new Scanner(System.in);
//		System.out.println("entre com um numero de 0 a 10 : " );
//		int numero = s.nextInt();
		
		int numero = 5;
		
		assert(numero >= 0) : "numero invalido" + numero;
		System.out.println("você entrou " + numero);
	}

}
