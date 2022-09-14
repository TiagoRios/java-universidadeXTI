package oo;

public enum Medida {
MM("Milimetro"), CM("Centimetro"), M("Metro");

public String titulo;
private Medida(String titulo) {
	this.titulo = titulo;
}
}
