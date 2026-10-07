package exercicios.jCelsius;

import java.util.Scanner;

// faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Fahrenheit
public class CelsiusFahrenheit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius que deseja converter em Fahrenheit: ");
        double celsius = input.nextDouble();
        double fahrenheit = calcularFahrenheit(celsius);
        System.out.printf(celsius + "ºC são aproximadamente %.2fºF.", fahrenheit);
        input.close();
    }

    public static double calcularFahrenheit(double celsius) {
        return ((celsius * 1.8) + 32);
    }
}
