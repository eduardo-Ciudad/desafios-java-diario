package dia16;
//Digite o saldo inicial:
//1000
//
//1 - Consultar saldo
//2 - Depositar
//3 - Sacar
//4 - Sair
//
//Escolha uma opção:
//2
//
//Digite o valor do depósito:
//500
//
//Depósito realizado com sucesso!
//
//Saldo atual: 1500

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. depositar");
        System.out.println("3. sacar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");
        int opcao = input.nextInt();
        int saldo = 1000;

        while (opcao != 4 ) {
            switch (opcao) {
                case 1:
                    System.out.println("seu saldo é de : " + saldo);

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    int sacarValor = input.nextInt();
                    if (sacarValor > saldo) {
                        System.out.println("Saldo insuficiente");
                    }

                case 3:
                    System.out.println("Digite o valor que deseja depositar: ");
                    int depositoValor = input.nextInt();

                case 4:
                    System.out.println("Saindo do programa...");
                    break;
            }
        }
        input.close();
    }
}
