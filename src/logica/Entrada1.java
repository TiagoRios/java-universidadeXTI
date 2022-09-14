package logica;

import javax.swing.JOptionPane;

public class Entrada1 {
 
  public static void main(String[] args){
//utiliza uma janela para pegar as informações
String nome = JOptionPane.showInputDialog("qual o seu nome??");
String sobreNome = JOptionPane.showInputDialog("qual seu sobrenome");
//System.out.println(nome);
//utiliza uma janela para mostrar as informações
JOptionPane.showMessageDialog(null, nome + " " +sobreNome);
}
}