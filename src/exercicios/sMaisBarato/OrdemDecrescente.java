package exercicios.sMaisBarato;

// Faça um Programa que leia três números inteiros e mostre-os em ordem decrescente.

import java.util.Scanner;

public class OrdemDecrescente {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor inteiro: ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
