package testes;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
  
public class Teste {  
        private JFrame frame;  
        private JPanel panel;  
        private JButton ok;  
        private JButton cancelar;  
        private boolean resultado;  
          
        public static void main(String[] args) {  
                Teste gui = new Teste();  
                gui.go();  
        }  
          
        public void go() {  
                frame = new JFrame("Teste");  
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                  
                ok = new JButton("OK");  
                ok.addActionListener(new okActionListener());  
                  
                cancelar = new JButton("Cancelar");  
                cancelar.addActionListener(new cancelarActionListener());  
                  
                panel = new JPanel();  
                panel.add(ok);  
                panel.add(cancelar);  
                frame.getContentPane().add(BorderLayout.CENTER, panel);  
                  
                frame.setSize(200, 100);  
                frame.setVisible(true);  
        }  
          
        class okActionListener implements ActionListener {  
                public void actionPerformed(ActionEvent ev) {  
                        resultado = true;  
                        System.out.println(resultado);  
                }  
        }  
          
        class cancelarActionListener implements ActionListener {  
                public void actionPerformed(ActionEvent ev) {  
                        resultado = false;  
                        System.out.println(resultado);  
                }  
        }  
}
