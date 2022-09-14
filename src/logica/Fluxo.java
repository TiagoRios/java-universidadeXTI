package logica;

import java.util.Random;
import java.util.Scanner;

public class Fluxo {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("qual seu palpite");
		int a = sc.nextInt();

		Random R = new Random();
		int dado = R.nextInt(1)+1;//+1 para não mostrar number 0;

		System.out.println("palpite = " + a);
		System.out.println("Dado = " + dado);

		if (a == dado) {
			System.out.println("vc acertou");
		} else {
			System.out.println("vc errou ");

		}
	}
}