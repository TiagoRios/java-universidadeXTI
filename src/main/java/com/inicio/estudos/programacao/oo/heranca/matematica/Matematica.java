package com.inicio.estudos.programacao.oo.heranca.matematica;

public class Matematica implements IOperacaoMatematica {
	
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	@Override
	public double somar(double... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

	@Override
	public int raiz(int numero) {
		int raiz = 0;
		int impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2; // proximo numero impar
			++raiz;
		}
		return raiz;
	}

	@Override
	public Double getDiametro(Integer raio) {
		return (double) (2 * raio);
	}

	@Override
	public Double getCircunferencia(Integer raio) {
		return (2 * Math.PI * raio);
	}

	@Override
	public Double getArea(Integer raio) {
		return Math.PI * (Math.pow(raio, 2));
	}

	@Override
	public double multiplicar(double x, double y) {
		return x * y;
	}
}