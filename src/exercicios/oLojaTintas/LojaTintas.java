package exercicios.oLojaTintas;

// Faça um programa para uma loja de tintas.
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que:
//A cobertura da tinta é de 1 litro para cada 3 metros quadrados;
//A tinta é vendida em latas de 18 litros;
//Cada lata custa R$ 80,00.
//Informe ao usuário:
//A quantidade de latas de tinta a serem compradas;
//O preço total.

import java.util.Scanner;

public class LojaTintas {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho em m² da área a ser pintada: ");
        double area = input.nextDouble();
        int latas = (int) Math.ceil(area/18);
        double preço = latas * 80;
        System.out.printf("A quantidade de latas necessária para esse trabalho são " + latas + " latas.");
        System.out.printf("\nO preço total é igual a R$%.2f.", preço);


        input.close();
    }
}
