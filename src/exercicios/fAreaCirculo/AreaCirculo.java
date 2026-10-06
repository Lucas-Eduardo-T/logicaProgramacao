package exercicios.fAreaCirculo;

import java.util.Scanner;

// faça um programa que peça o raio de um círculo, calcula e mostre sua área.
public class AreaCirculo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio de um círculo em m para saber sua área: ");
        double raio = entrada.nextDouble();
        double area = (3.14159 * raio * raio);
        System.out.println("Considere pi = 3.14159");
        System.out.printf("A área de um círculo de raio " + raio + " m é aproximadamente %.2f m²", area);
        entrada.close();
    }
}
