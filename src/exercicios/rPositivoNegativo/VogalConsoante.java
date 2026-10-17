package exercicios.rPositivoNegativo;

// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class VogalConsoante {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra para descobrir se ela é vogal ou consoante: ");
        String entrada = input.nextLine();
        if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
            System.out.println("Entrada inválida. Digite apenas uma letra.");
            input.close();
            return;
        }

        char letra = Character.toLowerCase(entrada.charAt(0));
        switch (letra) {
            case 'a':
                System.out.println("É vogal.");
                break;
            case 'e':
                System.out.println("É vogal.");
                break;
            case 'i':
                System.out.println("É vogal.");
                break;
            case 'o':
                System.out.println("É vogal.");
                break;
            case 'u':
                System.out.println("É vogal.");
                break;
            default:
                System.out.println("É consoante.");
                break;
        }
        input.close();
    }
}
