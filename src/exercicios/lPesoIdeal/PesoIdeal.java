package exercicios.lPesoIdeal;

// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, usando a seguinte fórmula:
// Peso ideal = (72,7 × altura) - 58

import java.util.Scanner;

public class PesoIdeal {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua altura em metros para sabermos seu peso ideal: ");
        double altura = input.nextDouble();
        double pesoIdeal = calcularIMC(altura);
        System.out.printf(nome + ", o seu peso ideal, baseado apenas na sua altura," +
                " e sem levar em conta outros aspectos físicos é aproximadamente %.2fKg.", pesoIdeal);

    }

    public static double calcularIMC(double altura){
        return ((72.7 * altura) - 58);
    }
}
