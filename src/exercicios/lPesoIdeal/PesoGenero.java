package exercicios.lPesoIdeal;

import java.util.Locale;
import java.util.Scanner;

// Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens:
//Peso ideal = (72,7 × altura) - 58
//Para mulheres:
//Peso ideal = (62,1 × altura) - 44,7
//Onde:
//h = altura
//Além disso, peça o peso da pessoa e informe se ela está:
//Dentro do peso ideal;
//Acima do peso ideal;
//Abaixo do peso ideal.
public class PesoGenero {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        String nome1 = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        System.out.println("Agora digite seu gênero: H/M");
        String genero = input.nextLine();
        String genero1 = genero.toUpperCase();
        System.out.println("Agora digite sua altura: ");
        double altura = input.nextDouble();
        switch (genero1){
            case "H":
                System.out.printf(nome1 + ", seu peso ideal, de acordo com sua altura e gênero é %.1fKg.", calcularPesoHomem(altura));
                break;
            case "M":
                System.out.printf(nome1 + ", seu peso ideal, de acordo com sua altura e gênero é %.1fKg.", calcularPesoMulher(altura));
                break;
            default:
                System.out.println("Não é um gênero válido nesse programa.");
                break;
        }
        input.close();

    }
    public static double calcularPesoHomem(double altura) {
        return ((altura * 72.7) - 58);
    }

    public static double calcularPesoMulher(double altura) {
        return ((altura * 62.1) - 44.7);
    }

}
