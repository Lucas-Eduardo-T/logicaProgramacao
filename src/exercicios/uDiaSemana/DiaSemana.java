package exercicios.uDiaSemana;

// Faça um Programa que leia um número e exiba o dia correspondente da semana.
//Número
//Dia
//1
//Domingo
//2
//Segunda-feira
//3
//Terça-feira
//4
//Quarta-feira
//5
//Quinta-feira
//6
//Sexta-feira
//7
//Sábado

import java.util.Scanner;

public class DiaSemana {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para saber a qual dia da semana ele corresponde:");
        int dia = input.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-feira!");
                break;
            case 3:
                System.out.println("Terça-feira!");
                break;
            case 4:
                System.out.println("Quarta-feira!");
                break;
            case 5:
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("dia não reconhecido.");
        }
    }
}
