package exercicios.hSalarioMensal;

import java.util.Scanner;

// faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês
// mostre o total do salário no mês
public class SalarioMensal {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário por hora: ");
        double valor = input.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horas = input.nextDouble();
        double salario = (valor * horas);
        System.out.printf("O salário do mês foi equivalente a R$%.2f", salario);
        input.close();
    }
}
