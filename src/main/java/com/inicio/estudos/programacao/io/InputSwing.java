package com.inicio.estudos.programacao.io;

import javax.swing.JOptionPane;

public class InputSwing {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("qual o seu nome??");
        String sobreNome = JOptionPane.showInputDialog("qual seu sobrenome");

        JOptionPane.showMessageDialog(null, nome + " " + sobreNome);
    }
}