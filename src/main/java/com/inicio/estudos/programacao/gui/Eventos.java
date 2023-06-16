package com.inicio.estudos.programacao.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Eventos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JButton botao;
	public Eventos(){
	super("Eventos");
	
	botao = new JButton("clique bem aqui");
	botao.addActionListener(this);
	getContentPane().add(botao);	
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(300, 300);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("nome");	
	}
}
