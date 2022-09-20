package com.inicio.estudos.programacao.oo.heranca.matematica;

public class Cubo implements IVolumeCalculavel, IAreaCalculavel {

	double lado;
	public Cubo(double lado){
		this.lado = lado ;
	}
	
	@Override
	public double caculaVolume() {
		return  6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		return lado* lado* lado;
	}
}