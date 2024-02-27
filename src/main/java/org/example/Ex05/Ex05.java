package org.example.Ex05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        scanner.close();

        double volume = 3.14 * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: " + volume);
    }
}
