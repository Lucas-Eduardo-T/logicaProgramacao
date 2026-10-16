package exercicios.qMaiorNumero;

// Faça um Programa que peça dois números e imprima o maior deles.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorNumero {
    static void main() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Esse programa pede 2 números inteiros e depois mostra o maior deles.");
            System.out.println("Digite o primeiro número:");
            int inteiro1 = input.nextInt();
            System.out.println("Digite o segundo número:");
            int inteiro2 = input.nextInt();
            if (inteiro1 > inteiro2) {
                System.out.printf("O primeiro valor, %d, é o maior valor entre os dois.", inteiro1);
            }
            else if (inteiro1 == inteiro2) {
                System.out.println("Os valores de ambos os números são iguais.");
            }
            else {
                System.out.printf("O segundo valor, %d, é o maior valor entre os dois.", inteiro2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Um dos valores não é reconhecido como número inteiro, portanto o programa será encerrado.");
            return;
        }

    }
}
