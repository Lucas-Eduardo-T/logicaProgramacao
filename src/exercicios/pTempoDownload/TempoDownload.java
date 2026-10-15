package exercicios.pTempoDownload;

// Faça um programa que peça:
//O tamanho de um arquivo para download (em MB);
//A velocidade de um link de Internet (em Mbps).
//Calcule e informe o tempo aproximado de download do arquivo usando este link, em minutos.

import java.util.Scanner;

public class TempoDownload {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho de um arquivo em MB(Mega Bytes) para saber" +
                " quanto tempo leva para fazer o download do mesmo: ");
        double megabyteson = input.nextDouble();
        System.out.println("Agora, digite a velocidade em Mbps (megabits por segundo) de download da sua internet para que" +
                " o tempo estimado de download seja calculado: ");
        double velocidadeDownload = input.nextDouble();
        if (megabyteson < 0 || velocidadeDownload <= 0) {
            System.out.println("O tamanho do arquivo não pode ser negativo e a velocidade deve ser maior que zero.");
            input.close();
            return;
        }
        int tempoDownload = (int) Math.ceil(calculoTempo(megabyteson, velocidadeDownload));
        System.out.printf("O tempo do download, em minutos, é aproximadamente %d min.%n", tempoDownload);
        input.close();
    }

    public static double calculoTempo(double megabyteson, double velocidadeDownload) {
        return (megabyteson * 8) / velocidadeDownload / 60;
    }
}
