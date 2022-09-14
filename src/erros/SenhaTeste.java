package erros;

public class SenhaTeste {

	// metodo que recebe uma senha verifica se a senha informada e igual a senha
	// correta.
	static void autenticar(String senha) throws SenhaInvalidaException {
		if ("1234".equals(senha)) {
			// autenticado
			System.out.println("autenticado");
		} else {
			// senha incorreta
			// agora e uma exceçao verifical entao tenho que lanca na assinatura
			// do metodo la em cima.
			throw new SenhaInvalidaException("senha incorrera");
		}
	}

	public static void main(String[] args) {
		try {
			autenticar("123");
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.err.println("MENSAGEM DE ERRO = " + e.getMessage());
		}
	}
}
