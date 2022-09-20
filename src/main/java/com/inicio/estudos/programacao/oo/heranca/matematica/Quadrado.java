package com.inicio.estudos.programacao.oo.heranca.matematica;

public class Quadrado implements IAreaCalculavel {

	double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}
}