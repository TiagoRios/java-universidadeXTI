package com.inicio.estudos.programacao.outros.aleatoriedade;

import java.util.Random;
import java.util.Scanner;

public class PalpiteDado {

	public static void main(String[] args) {
		final Scanner scanner;

		scanner = new Scanner(System.in);
		System.out.println("qual seu palpite");
		int a = scanner.nextInt();

		Random random = new Random();
		int dado = random.nextInt(1) + 1;

		System.out.println("palpite = " + a);
		System.out.println("Dado = " + dado);

		if (a == dado) {
			System.out.println("vc acertou");
		} else {
			System.out.println("vc errou ");
		}
		scanner.close();
	}
}