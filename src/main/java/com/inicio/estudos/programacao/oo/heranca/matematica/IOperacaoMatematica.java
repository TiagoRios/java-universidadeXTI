package com.inicio.estudos.programacao.oo.heranca.matematica;

public interface IOperacaoMatematica {
	public int raiz(int numero);
	public double somar (double ... numeros);
	public double multiplicar(double x, double y );
	public Double getArea(Integer raio);
	public Double getDiametro(Integer raio);
	public Double getCircunferencia(Integer raio);
}
