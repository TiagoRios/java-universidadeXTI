package com.inicio.estudos.programacao.outros.aleatoriedade;

import java.util.Random;

public class Cartas {

	public static void main(String[] args) {
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		String[] nipes = { "Espadas", "Paus", "Copa", "Ouro" };

		Random random = new Random();

		String face = faces[random.nextInt(faces.length)];
		String nipe = nipes[random.nextInt(nipes.length)];

		String carta = face + " de " + nipe;
		System.out.println(carta);
		System.out.println(faces[random.nextInt(faces.length)] + " de " + nipes[random.nextInt(nipes.length)]);
	}
}