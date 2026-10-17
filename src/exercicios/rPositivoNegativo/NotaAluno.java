package exercicios.rPositivoNegativo;

// Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada pelo aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a 7;
//A mensagem "Reprovado", se a média for menor do que 7;
//A mensagem "Aprovado com Distinção", se a média for igual a 10.

import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotaAluno {


    static void main() {
        try {
            double contador = 0;
            for (int i = 0; i < 2; i++){
                Scanner input = new Scanner(System.in);
                System.out.println("Digite a " + (i + 1) + " nota:");
                double nota = input.nextDouble();
                contador += nota;
            }
            double media = (contador / 2);
            System.out.printf("Media: %.2f%n" , Math.floor(media * 10)/10);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido., digite números com vírgulas ou inteiros, sem pontos ou outros caracteres.");
        }
    }
}
