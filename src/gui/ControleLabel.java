package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ControleLabel extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ControleLabel(){
		super("Label");
		
		JLabel simples = new JLabel("Label simples");
		//quando passar o mause no nome aparecer o que significa
		simples.setToolTipText("meu tooltip");
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label simples");
		label.setFont(fonte);
		label.setForeground(Color.PINK);
		
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/ck.jpg"));
		JLabel imagem = new JLabel(icon);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//adicionando controles
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ControleLabel();
	}

}
