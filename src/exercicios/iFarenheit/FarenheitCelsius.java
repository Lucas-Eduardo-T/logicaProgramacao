package exercicios.iFarenheit;

import java.util.Scanner;

// faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
public class FarenheitCelsius {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = ((fahrenheit - 32) * 5)/9;
        System.out.printf(fahrenheit + " graus fahrenheit são aproximadamente a %.2fºC.", celsius);
        input.close();
    }
}
