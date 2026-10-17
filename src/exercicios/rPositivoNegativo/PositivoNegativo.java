package exercicios.rPositivoNegativo;


import java.util.InputMismatchException;
import java.util.Scanner;

// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class PositivoNegativo {
    static void main() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite o número que você deseja saber se é positivo ou negativo: ");
            double numero = input.nextDouble();
            if (numero >= 0) {
                System.out.println("O valor digitado é POSITIVO.");
            }
            else {
                System.out.println("O valor digitado é NEGATIVO.");
            }

        } catch (InputMismatchException e) {
            System.out.println("O valor digitado não corresponde a um número da casa dos reais.");
            return;
        } finally {
            input.close();
        }
    }
}
