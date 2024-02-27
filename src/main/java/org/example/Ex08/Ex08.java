package org.example.Ex08;

import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {
        String inputValorProduto = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valorProduto = Double.parseDouble(inputValorProduto);

        String inputCodigoAumento = JOptionPane.showInputDialog("Digite o código de aumento (1, 3, 4 ou 8):");
        int codigoAumento = Integer.parseInt(inputCodigoAumento);

        double novoValorProduto;
        switch (codigoAumento) {
            case 1:
                novoValorProduto = valorProduto * 1.10;
                break;
            case 3:
                novoValorProduto = valorProduto * 1.25;
                break;
            case 4:
                novoValorProduto = valorProduto * 1.30;
                break;
            case 8:
                novoValorProduto = valorProduto * 1.50; // 50% de aumento
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de aumento inválido!");
                return;
        }

        JOptionPane.showMessageDialog(null, "Novo valor do produto: R$ " + novoValorProduto);
    }
}
