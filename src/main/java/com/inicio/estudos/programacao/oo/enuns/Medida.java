package com.inicio.estudos.programacao.oo.enuns;

public enum Medida {
	MM("Milimetro"), CM("Centimetro"), M("Metro");

	String titulo;

	private Medida(String titulo) {
		this.titulo = titulo;
	}
}
