package oo;

public class CachorroT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "pit bull";
		pitbull.tamanho = 40;
		pitbull.latir();

		Cachorro viralata = new Cachorro();
		viralata.raca = "vira-lata";
		viralata.tamanho = 32;
		viralata.latir();
		
	}

}
