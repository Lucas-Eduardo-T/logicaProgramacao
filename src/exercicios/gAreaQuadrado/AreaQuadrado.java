package exercicios.gAreaQuadrado;

import java.util.Scanner;

// faça um programa que peça o lado de um quadrado e mostre a área dele.
public class AreaQuadrado {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o lado em metros do quadrado que você deseja descobrir a área: ");
        double lado = input.nextDouble();
        double area = (lado * lado);
        System.out.printf("A área do quadrado de lado " + lado + "m é %.2fm²", area);
        input.close();
    }
}
