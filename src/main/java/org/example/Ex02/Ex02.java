package org.example.Ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);

        double[] alturas = new double[10];
        char[] generos = new char[10];
        double somaAlturaHomens = 0;
        int  numMulheres = 0;

        for(int i = 0; i < 10; i++ ){
            System.out.println("Digite a altura da pessoa: " + (i + 1) + " em metros: ");
            alturas[i] = scanner.nextDouble();
            System.out.println("Digite o sexo da pessoa: " + (i + 1) + " (M/F): ");
            generos[i] =scanner.next().charAt(0);
        }

        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        for(int i = 1; i < 10; i++){
            if (alturas[i] > maiorAltura){
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }
        int numHomens = 0;
        for (int i = 0; i < 10; i++) {
            if (generos[i] == 'M' || generos[i] == 'm') {
                somaAlturaHomens += alturas[i];
                numHomens++;
            } else {
                numMulheres++;
            }
        }
        double mediaAlturaHomens = somaAlturaHomens/numHomens;

        System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
        System.out.println("Menor altura do grupo: " + menorAltura + " metros");
        System.out.println("Média de altura de homens: " + mediaAlturaHomens + " metros");
        System.out.println("Número de mulheres: " + numMulheres);
    }
}
