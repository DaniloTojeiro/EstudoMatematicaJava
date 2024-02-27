package org.example.Ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaSalarios = 0;

        System.out.println("Digite os 5 salários:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Salário " + (i+1) + ": ");
            double salario = scanner.nextDouble();
            somaSalarios += salario;
        }

        double mediaSalarial = somaSalarios / 5;

        System.out.println("A média salarial é: " + mediaSalarial);

        scanner.close();
    }
}
