package exercicios.dQuatroNotas;

import java.util.Scanner;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class QuatroNotas {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua nota do primeiro bimestre: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua nota do segundo bimestre: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua nota do terceiro bimestre: ");
        double nota3 = entrada.nextDouble();
        System.out.println("Digite sua nota do quarto bimestre: ");
        double nota4 = entrada.nextDouble();
        double media = ((nota1 + nota2 + nota3 + nota4) / 4);
        System.out.printf("A sua média do bimestre foi %.2f.", media);
        entrada.close();
    }
}
