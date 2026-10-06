package exercicios.eConversaoMetrosCentimetros;

import java.util.Scanner;

// Faça um programa que converta metros digitados em centímetros.
public class MetrosCentimetros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor em metros que deseja converter em centímetros:");
        double metros = input.nextDouble();
        double centimetros = (metros * 100);
        System.out.printf(metros + " metros é equivalente a %.2f centímetros.", centimetros);
        input.close();
    }
}
