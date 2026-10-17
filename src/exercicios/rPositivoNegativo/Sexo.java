package exercicios.rPositivoNegativo;

// Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra, escrever:
//F — Feminino
//M — Masculino
//Outro valor — Sexo Inválido

import java.util.Scanner;

public class Sexo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu sexo, sendo 'M' para masculino e 'F' para feminino: ");
            char sexo = Character.toUpperCase(input.next().charAt(0));
            if (sexo == 'M' || sexo == 'F') {
                if (sexo == 'M'){
                    System.out.println("M - Masculino.");
                }
                else {
                    System.out.println("F - Feminino.");
                }
            } else {
                System.out.println("Valor inválido.");
            }
    }
}

