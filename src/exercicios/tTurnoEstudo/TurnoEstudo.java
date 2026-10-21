package exercicios.tTurnoEstudo;

// Faça um Programa que pergunte em que turno você estuda.
//Peça para digitar:
//M — Matutino
//V — Vespertino
//N — Noturno
//Imprima a mensagem:
//"Bom Dia!"
//"Boa Tarde!"
//"Boa Noite!"
//"Valor Inválido!"
//conforme o caso.

import java.util.Scanner;

public class TurnoEstudo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o horário em que você estuda, sendo");
        System.out.println("M - Matutino, V - Vespertino, N - Noturno:");
        String turno = input.nextLine().toUpperCase();
        if (turno.length() == 1) {

            switch (turno) {
                case "M":
                    System.out.println("Bom dia!");
                    break;
                case "V":
                    System.out.println("Boa tarde!");
                    break;
                case "N":
                    System.out.println("Boa noite!");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }

        } else {
            System.out.println("Valor incorreto ou mais de um caractere foi digitado.");
        }

    }


}

