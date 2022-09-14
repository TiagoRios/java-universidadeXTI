package logica;

import java.util.ArrayList;

public class Fluxo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		for (Integer numero : list) {
			System.out.println(numero);
		}
	}
}
