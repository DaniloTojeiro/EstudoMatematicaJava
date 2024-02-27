package org.example.Ex10;

import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Cadastre sua senha:");

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real:"));

        String senhaUsuario = JOptionPane.showInputDialog("Digite sua senha:");
        if (senhaUsuario.equals(senha)) {
            double resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta. Encerrando o aplicativo.");
        }

    }
}
