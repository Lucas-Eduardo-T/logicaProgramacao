package exercicios.sMaisBarato;

// Faça um programa que pergunte o preço de três produtos e informe qual
// produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class MaisBarato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double menorPreco = Double.POSITIVE_INFINITY;
        int p = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor do " + (i + 1) + "º produto:");
            double preco = input.nextDouble();
            if (preco < menorPreco) {
                menorPreco = preco;
                p = i;
            }
        }
        System.out.println("Você deve comprar o " + (p + 1) + "º produto.");
        input.close();
    }
}
