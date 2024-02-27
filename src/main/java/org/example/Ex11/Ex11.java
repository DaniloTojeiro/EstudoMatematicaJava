package org.example.Ex11;

import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        String operacao = JOptionPane.showInputDialog("Escolha a operação desejada (+, -, *, /):");

        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
    }
