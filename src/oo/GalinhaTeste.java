package oo;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar().botar();
		System.out.println("ovos primeira galinha = " + g1.ovos);
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
		System.out.println("ovos segunda galinha = " + g2.ovos);
	System.out.println("Ovos da granja = " + Galinha.ovosDaGranja);
	System.out.println("Média de ovos = " + Galinha.mediaDeOvos(2));
	}

}
