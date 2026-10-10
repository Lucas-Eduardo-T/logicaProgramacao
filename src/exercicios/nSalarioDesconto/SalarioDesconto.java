package exercicios.nSalarioDesconto;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados:
//11% para o Imposto de Renda;
//8% para o INSS;
//5% para o sindicato.
//O programa deverá informar:
//a) Salário bruto.
//b) Quanto pagou ao INSS.
//c) Quanto pagou ao sindicato.
//d) Salário líquido.

import java.util.Scanner;
public class SalarioDesconto {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu salário por hora: ");
        double dinheiroHora = input.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();
        double salarioBruto = dinheiroHora * horasTrabalhadas;
        double irrf = ((salarioBruto) * 11/100);
        double inss = ((salarioBruto) * 8/100);
        double sindicato = ((salarioBruto) * 5/100);
        double salarioLiquido = salarioBruto - irrf - inss - sindicato;
        System.out.printf("O seu salário bruto é R$%.2f.", salarioBruto);
        System.out.printf("\nVocê pagou ao inss R$%.2f.", inss);
        System.out.printf("\nVocê pagou ao sindicato R$%.2f.", sindicato);
        System.out.printf("\nO seu salário líquido é R$%.2f.", salarioLiquido);
        input.close();
    }
}
