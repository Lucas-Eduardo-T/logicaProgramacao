package exercicios.oLojaTintas;

// Faça um programa para uma loja de tintas.
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que:
//A cobertura da tinta é de 1 litro para cada 6 metros quadrados;
//A tinta é vendida em latas de 18 litros, que custam R$ 80,00;
//A tinta também é vendida em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os
// respectivos preços nas 3 situações:
//a) Comprar apenas latas de 18 litros.
//b) Comprar apenas galões de 3,6 litros.
//c) Misturar latas e galões, de forma que o preço seja o menor possível.
//Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas e galões cheios.

import java.util.Scanner;

public class LatasGaloes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = input.nextDouble();
        if (!Double.isFinite(area) || area <= 0) {
            System.out.println("A área deve ser um número positivo.");
            input.close();
            return;
        }

        double precoLata = 80;
        double precoGaloes = 25;

        // Cada litro cobre 6 m². Acrescentamos 10% de folga à tinta necessária.
        double litros = (area / 6) * 1.10;

        // Math.ceil arredonda para cima, pois só podemos comprar embalagens inteiras.
        int latas = (int) Math.ceil(litros / 18);
        int galoes = (int) Math.ceil(litros / 3.6);
        double totalLata = precoLata * latas;
        double totalGaloes = precoGaloes * galoes;

        // Começamos com as latas completas e cobrimos o restante com galões.
        int latasMistura = (int) Math.floor(litros / 18);
        double litrosRestantes = litros - latasMistura * 18;
        int galoesMistura = (int) Math.ceil(litrosRestantes / 3.6);

        // Uma lata equivale a 5 galões. Se os galões custarem mais que uma
        // lata, comprar uma lata extra é a opção mais barata.
        if (galoesMistura * precoGaloes > precoLata) {
            latasMistura++;
            galoesMistura = 0;
        }
        double totalMistura = latasMistura * precoLata + galoesMistura * precoGaloes;

        System.out.printf("Tinta necessária com 10%% de folga: %.2f litros.%n", litros);
        System.out.printf("Apenas latas de 18 litros: %d lata(s), por R$ %.2f.%n", latas, totalLata);
        System.out.printf("Apenas galões de 3,6 litros: %d galão(ões), por R$ %.2f.%n", galoes, totalGaloes);
        System.out.printf("Opção mais barata: %d lata(s) e %d galão(ões), por R$ %.2f.%n",
                latasMistura, galoesMistura, totalMistura);
        input.close();
    }

}
