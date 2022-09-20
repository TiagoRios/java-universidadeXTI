package com.inicio.estudos.programacao.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTexto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;

	public ControleTexto() {
		super("textos e senhas");

		login = new JTextField();
		senha = new JPasswordField();

		ok = new JButton("ok");
		ok.addActionListener(new BotaoOkListener());

		cancel = new JButton("cancel");
		cancel.addActionListener(new BotaoCancelListener());

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("login:"));
		c.add(login);
		c.add(new JLabel("senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleTexto();
	}

	// classe para tratar os eventos do botao "OK"
	class BotaoOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "login: " + login.getText() +
					"\nsenha: "+ new String(senha.getPassword());
			
			// apresentar uma mensagem
			JOptionPane.showMessageDialog(null, s);
		}
	}

	// classe para tratar os eventos do botao "CANCEL"
	class BotaoCancelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
