package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JTextField texto;
	JCheckBox bold, italic;

	public ControleCheck() {
		super();

		texto = new JTextField(44);
		texto = new JTextField("veja a fonte mudar", 26);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));

		bold = new JCheckBox("Bold");
		// recebe um objeto que implementa a interface item listener
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JTextField());
		c.add(bold);
		c.add(italic);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}

	// classe interna para manipular os eventos da check box
	class CheckListener implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			if (bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			} else if (bold.isSelected()) {
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			} else if (italic.isSelected()) {
				texto.setFont(new Font("serif", Font.ITALIC, 26));
			} else {
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			}
		}
	}
	
	public static void main(String[] args) {
		new ControleCheck();
	}
}
