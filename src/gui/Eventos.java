package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Eventos extends JFrame implements ActionListener {

	JButton botao;
	public Eventos(){
	super("Eventos");
	
	botao = new JButton("clique bem aqui");
	botao.addActionListener(this);
	getContentPane().add(botao);	
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
