package oo;

public class EnumTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(PecaXadrez.BISPO);
		System.out.println(Medida.M.titulo);
		// percorrer todos as enumera�oes (Enums)
		for (Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
		// percorrer todos as enumera�oes (Enums)
		for (PecaXadrez x : PecaXadrez.values()) {
			System.out.println(x + " : " + x);	
		}
	}

}
