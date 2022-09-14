package oo;

public class FuncionarioPacote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.getNome();
		//f.nome = "eu";
		String fu = f.getNome();
		f.setNome("asdfkasdfjkasdf");
		System.out.println(fu);
		System.out.println();
	}

}
