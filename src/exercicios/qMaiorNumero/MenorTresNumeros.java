package exercicios.qMaiorNumero;

// Faça um Programa que leia três números e mostre o maior e o menor deles.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenorTresNumeros {
    static void main() {
        int maior = 0;
        int menor = 0;
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o " + (i + 1) + " número inteiro: ");
                int numero = input.nextInt();
                if (i == 0) {
                    // O primeiro número substitui os zeros iniciais antes das comparações.
                    maior = numero;
                    menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }

            }
            System.out.println("O maior valor entre os três digitados é " + maior + ".");
            System.out.println("O menor valor entre os três digitados é " + menor + ".");
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não corresponde a um número inteiro.");
        }
    }
}
