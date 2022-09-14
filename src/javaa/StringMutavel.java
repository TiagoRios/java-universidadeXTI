package javaa;

public class StringMutavel {

	public static void main(String[] args) {

		// as duas tem o mesmo metodo a diferenca e que a StringBuffer tem
		// metodos ciclonizados
		//StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("muito louco");

		s1.toString();
		s1.length();
		System.out.println(s1.length());
		// capacity imforma a capacidade de que pode ter o objeto
		s1.capacity();
		System.out.println(s1.capacity());
		// s1.reverse();
		// ADICIONAR MAIS STRINGS SEM MODIFICA-LA
		s1.append(" Trabalhando");
		System.out.println(s1);

		String s = "oi" + " como " + "vai você?";
		String sb = new StringBuffer("oi").append(" como ").append("vai vc?")
				.toString();

		System.out.println(s);
		System.out.println(sb);
		
		String url = new StringBuilder("www.eu.com.br").delete(0, 4).toString();
System.out.println(url);
	}

}
