package heranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto=  new Cachorro();
		toto.peso = 10;
		toto.comida ="carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.peso = 2;
		carijo.comida= "alpiste";
		carijo.dormir();
		
		System.out.println("galinha peso "+carijo.peso);
		System.out.println("galinha come "+carijo.comida);
		
		System.out.println("cachorro peso " + toto.peso);
		System.out.println("cachorro come " + toto.comida);

	}

}
