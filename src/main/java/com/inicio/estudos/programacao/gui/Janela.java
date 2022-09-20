package com.inicio.estudos.programacao.gui;

import javax.swing.*;

public class Janela extends JFrame {
	public Janela(){
		super("minha janela");
		JButton botao = new JButton("clique");
		getContentPane().add(botao);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela();
	}
}
