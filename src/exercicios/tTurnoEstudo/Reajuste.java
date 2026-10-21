package exercicios.tTurnoEstudo;

// As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
// contrataram para desenvolver o programa que calculará os reajustes.
// Faça um programa que receba o salário de um colaborador e o reajuste segundo
// o seguinte critério, baseado no salário atual:
// até R$280,00 -             20% de aumento
// de R$280,01 até R$700,00 - 15% de aumento
// de R$700,01 até 1500,00 -  10% de aumento
// R$1500,00 em diante -       5% de aumento
// Após o aumento ser realizado, informe na tela:
// O salário antes do reajuste;
// O percentual de aumento aplicado;
// O valor do aumento;
// O novo salário, após o aumento.

import java.util.Scanner;

public class Reajuste {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu salário para saber o novo valor depois do reajuste: ");
        double salario = input.nextDouble();
        double antigo = 0;
        if (salario >= 0 && salario <= 280){
            antigo = salario;
            salario = reajusteA(salario);
            System.out.printf("O seu salário antes do ajuste era R$%.2f", antigo);
            System.out.print("\nO reajuste foi de 20%.");
            System.out.printf("\nO aumento real foi de R$%.2f", ((salario) - (antigo)));
            System.out.printf("\nO novo salário é igual a R$%.2f", salario);

        }
        else if (salario > 280 && salario <= 700){
            antigo = salario;
            salario = reajusteB(salario);
            System.out.printf("O seu salário antes do ajuste era R$%.2f", antigo);
            System.out.print("\nO reajuste foi de 15%.");
            System.out.printf("\nO aumento real foi de R$%.2f", ((salario) - (antigo) ));
            System.out.printf("\nO novo salário é igual a R$ %.2f", salario);
        }
        else if (salario > 700 && salario <= 1500){
            antigo = salario;
            salario = reajusteC(salario);
            System.out.printf("O seu salário antes do ajuste era R$%.2f", antigo);
            System.out.print("\nO reajuste foi de 10%.");
            System.out.printf("\nO aumento real foi de R$%.2f", (salario - antigo));
            System.out.printf("\nO novo salário é igual a R$ %.2f", salario);
        }
        else {
            antigo = salario;
            salario = reajusteD(salario);
            System.out.printf("O seu salário antes do ajuste era R$%.2f", antigo);
            System.out.print("\nO reajuste foi de 5%.");
            System.out.printf("\nO aumento real foi de R$%.2f", ((salario) - (antigo) ));
            System.out.printf("\nO novo salário é igual a R$ %.2f", salario);
        }


    }


    public static double reajusteA(double salario){
        return (salario * 1.2);
    }
    public static double reajusteB(double salario){
        return (salario * 1.15);
    }
    public static double reajusteC(double salario){
        return (salario * 1.1);
    }
    public static double reajusteD(double salario){
        return (salario * 1.05);
    }
}
