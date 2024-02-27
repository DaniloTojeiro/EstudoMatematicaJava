package org.example.Ex07;

import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {
        // Pedindo ao usuário o número de funcionários
        int numFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de funcionários:"));

        double somaSalarios = 0;

        // Pedindo ao usuário os salários e calculando a soma
        for (int i = 1; i <= numFuncionarios; i++) {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário " + i + ":"));
            somaSalarios += salario;
        }

        // Calculando a média dos salários
        double mediaSalarios = somaSalarios / numFuncionarios;

        // Exibindo a média dos salários
        JOptionPane.showMessageDialog(null, "A média dos salários é: " + mediaSalarios);
    }
}
