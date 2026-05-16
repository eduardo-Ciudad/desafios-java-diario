package dia10;

import java.util.Scanner;

public class estacionamento {
    //Desafio do Dia 10 — Sistema de Estacionamento
    //
    //Crie um programa em Java que simule o funcionamento de um estacionamento.
    //
    //Requisitos
    //O usuário informa:
    //Hora de entrada (0 a 23)
    //Hora de saída (0 a 23)
    //O programa deve calcular:
    //Quantidade de horas estacionadas
    //Valor total a pagar
    //Regras de cobrança:
    //Primeira hora: R$ 5,00
    //Cada hora adicional: R$ 3,00
    //Se o carro permanecer por menos de 1 hora, cobrar a primeira hora completa.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora de entrada:");
        int horaEntrada = input.nextInt();
        System.out.println("Digite a hora de saida:");
        int horaSaida = input.nextInt();

        int horaTotal;

        if (horaSaida > horaEntrada) {
            horaTotal = horaSaida - horaEntrada;
        } else if (horaSaida < horaEntrada) {
            horaTotal = (24 - horaEntrada) - horaSaida;
        } else {
            horaTotal = 24;
        }

        int valorTotal;

        if (horaTotal == 1) {
            valorTotal = 5;
        } else {
            valorTotal = 5 + (horaTotal - 1) * 3;
        }
        System.out.println("Tempo estacionado: " + horaTotal + " hora(s)");
        System.out.println("Valor a pagar: R$ " + valorTotal + ",00");

        input.close();
    }
}
