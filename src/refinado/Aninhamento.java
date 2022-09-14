package refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Aninhamento extends JFrame {

	JButton botao;
	public Aninhamento(){
		super("Aninhamento");
		botao = new JButton("ok");
		
		//adicionando a classe aninhada
		botao.addActionListener(new ListenerAninhado());
		//adicionando a classe interna (ou anônima)
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("classe Anônima executa "+ botao.getText());	
			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		}

	public class ListenerAninhado implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("classe aninhada executa "+ botao.getText());
		}
	}
	
	public static void main(String[] args) {
	Aninhamento janela = new Aninhamento();
	
	//declarando e criando uma classe envolvente
	@SuppressWarnings("unused")
	Aninhamento.ListenerAninhado listener = 
			janela.new ListenerAninhado();
	}
	}