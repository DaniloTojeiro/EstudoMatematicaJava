package org.example.Ex06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em quilogramas: ");
        double massa = scanner.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o tempo em segundos: ");
        double tempo = scanner.nextDouble();

        scanner.close();

        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é: " + cavalos);
    }
}
