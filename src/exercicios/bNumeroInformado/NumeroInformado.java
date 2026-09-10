package exercicios.bNumeroInformado;

import java.util.Scanner;

// Faça um Programa que peça um número inteiro e então mostre a mensagem:
//"O número informado foi [número]."
public class NumeroInformado {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro para que ele apareça" +
                " na tela:");
        int numero = entrada.nextInt();
        System.out.println("O número informado foi: " + numero + ".");
        entrada.close();
    }
}
