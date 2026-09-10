package exercicios.cSomaDoisNumeros;

import java.util.Scanner;
// Faça um Programa que peça dois números inteiros e imprima a soma.
public class SomaDoisNumeros {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma entre os valores " + numero1 + " e " + numero2 + " é: " +
        soma + ".");
        entrada.close();
    }
}
