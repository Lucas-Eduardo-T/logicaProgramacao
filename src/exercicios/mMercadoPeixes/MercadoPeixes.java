package exercicios.mMercadoPeixes;

import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
// diário de seu trabalho.
//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de
//pesca do estado de São Paulo (50 quilos), deve pagar uma multa de R$ 4,00 por quilo
//excedente.
//João precisa que você faça um programa que leia a variável peso (peso de peixes)
// e verifique se há excesso.
//Se houver excesso, gravar:
//Na variável excesso, o valor correspondente ao peso excedente;
//Na variável multa, o valor da multa que João deverá pagar.
//Caso contrário, mostrar tais variáveis com o conteúdo ZERO.
public class MercadoPeixes {
    static void main() {
        Scanner input = new Scanner(System.in);
        int excesso = 0;
        double multa = 0;
        int diferença;
        System.out.println("Digite quantos quilos de peixe foram trazidos: ");
        int peso = input.nextInt();
        if (peso <= 50){
            System.out.println("Não houve excesso de peso.");
            System.out.println("Excesso de peso: " + excesso);
            System.out.println("Multa a pagar: " + multa);

        }
        else {
            System.out.println("Foram trazidos mais de 50 quilos de peixe, logo: ");
            diferença = (peso - 50);
            excesso = diferença;
            multa = (diferença * 4);
            System.out.println("Houve excesso de peso equivalente a " + excesso + " quilos." );
            System.out.println("Portanto, deverá ser paga uma multa equivalente a R$" + multa);
        }
        input.close();
    }
}
