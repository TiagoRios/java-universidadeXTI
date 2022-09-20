package com.inicio.estudos.programacao.io;

import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("qual seu nome?");
		String nome = scanner.nextLine();
		System.out.println("Bem vindo " + nome);
		scanner.close();
	}
}