package exercicios.qMaiorNumero;

// Faça um Programa que leia três números e mostre o maior deles.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorTresNumeros {
    static void main() {
        int contador = 0;
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o " + (i + 1) + " número inteiro: ");
                int numero = input.nextInt();
                if (contador <= numero) {
                    contador = numero;
                }
            }
            System.out.println("O maior valor entre os três digitados é " + contador + ".");
        // Ao sair do try, o Java chama input.close() automaticamente, mesmo se houver erro.
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não corresponde a um número inteiro.");
        }
    }
}
