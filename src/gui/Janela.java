package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	public Janela(){
		//JFrame frame = new JFrame();
		super("minha janela");
		JButton botao = new JButton("clique");
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela();
	}
}
