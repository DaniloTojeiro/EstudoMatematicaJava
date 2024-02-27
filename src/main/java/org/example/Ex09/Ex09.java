package org.example.Ex09;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args) {
        String inputHorasTrabalhadas = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = Double.parseDouble(inputHorasTrabalhadas);

        String inputSalarioHora = JOptionPane.showInputDialog("Digite o salário por hora:");
        double salarioHora = Double.parseDouble(inputSalarioHora);

        String inputNumeroDependentes = JOptionPane.showInputDialog("Digite o número de dependentes:");
        int numeroDependentes = Integer.parseInt(inputNumeroDependentes);

        double salarioBruto = horasTrabalhadas * salarioHora + (50 * numeroDependentes);

        double inss;
        if (salarioBruto <= 1000) {
            inss = salarioBruto * 8.5 / 100;
        } else {
            inss = salarioBruto * 9 / 100;
        }

        double ir;
        if (salarioBruto <= 500) {
            ir = 0;
        } else if (salarioBruto <= 1000) {
            ir = salarioBruto * 5 / 100;
        } else {
            ir = salarioBruto * 7 / 100;
        }

        double salarioLiquido = salarioBruto - inss - ir;

        String mensagem = "Informações:\n\n"
                + "Salário bruto: R$ " + salarioBruto + "\n"
                + "Horas trabalhadas: " + horasTrabalhadas + "\n"
                + "Desconto INSS: R$ " + inss + "\n"
                + "Desconto IR: R$ " + ir + "\n"
                + "Salário líquido: R$ " + salarioLiquido;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
