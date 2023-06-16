package com.inicio.estudos.programacao.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Layouts2(){
		super("Layouts");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
				
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("centro"));
		//a leste colocar o conteiner de botoes
		c.add(BorderLayout.EAST, c2);
		
		
		/*
		c.setLayout(new BorderLayout(10,10));//espa�amento em pixel
		
		c.add(BorderLayout.NORTH,new JButton("n"));
		c.add(BorderLayout.SOUTH,new JButton("s"));
		c.add(BorderLayout.WEST,new JButton("w"));
		c.add(BorderLayout.EAST,new JButton("e"));
		c.add(BorderLayout.CENTER,new JButton("c"));
		*/
		/*
		c.setLayout(new GridLayout(2,3));//linhas seguido de colunas
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		}

	public static void main(String[] args) {
		new Layouts2();
	}
}
