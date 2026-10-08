package exercicios.kDoisInteirosUmReal;

// Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre:
//a) O produto do dobro do primeiro com metade do segundo.
//b) A soma do triplo do primeiro com o terceiro.
//c) O terceiro elevado ao cubo.

import java.util.Scanner;

public class DoisInteirosUmReal {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor inteiro: ");
        int primeiro = input.nextInt();
        System.out.println("Digite o segundo valor inteiro: ");
        int segundo = input.nextInt();
        System.out.println("Digite o único valor real: ");
        double unico = input.nextDouble();
        double letterA = letraA(primeiro, segundo);
        double letterB = letraB(primeiro, unico);
        double letterC = letraC(unico);
        System.out.printf("O resultado da letra a é: %.2f", letterA);
        System.out.println();
        System.out.printf("O resultado da letra b é: %.2f", letterB);
        System.out.println();
        System.out.printf("O resultado da letra c é: %.2f", letterC);
    }

    public static double letraA(int primeiro, double segundo){
        return ((primeiro * 2) * (segundo/2));
    }

    public static double letraB(int primeiro, double unico){
        return ((primeiro * 3) + unico);
    }

    public static double letraC(double unico){
        return (unico * unico * unico);
    }
}
