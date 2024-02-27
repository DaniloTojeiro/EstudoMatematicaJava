package org.example.Ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        System.out.println("Temperatura em Reaumur: " + reaumur + " Re");
        System.out.println("Temperatura em Rankine: " + rankine + " Ra");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " F");
    }
}