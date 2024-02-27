package org.example.Ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da parede em metros: ");
        double hp = scanner.nextDouble();
        System.out.println("Digite a largura da parede em metros: ");
        double lp = scanner.nextDouble();
        System.out.println("Digite a altura do azulejo em metros: ");
        double ha = scanner.nextDouble();
        System.out.println("Digite a largura do azulejo em metros: ");
        double la = scanner.nextDouble();

        double areaParede = hp * lp;
        double areaAzulejo = ha * la;
        int quantidadeAzulejos = (int) Math.ceil(areaParede/areaAzulejo);

        System.out.println("Serão necessários " + quantidadeAzulejos + "azulejos para cobrir a parede");
    }
}
