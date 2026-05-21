package dia15;

import java.util.Scanner;

//Desafio Dia 15 — Sistema de Mercado
//Objetivo
//
//Criar um programa que:
//
//Cadastre produtos
//Some valores
//Aplique desconto
//Mostre resumo da compra
//Trabalhe com loops e arrays
public class SimuladorDeMercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos produtos você vai cadastrar?");
        int quantos = input.nextInt();
        input.nextLine();

        double total = 0;
        double desconto = 0;

        for (int i = 1; i <= quantos; i++) {

            System.out.println("\nProduto " + i);

            System.out.println("Digite o nome do produto:");
            String nomeProduto = input.nextLine();

            System.out.println("Digite o valor do produto:");
            double valor = input.nextDouble();

            System.out.println("Digite a quantidade do produto:");
            int quantidade = input.nextInt();
            input.nextLine();

            double subtotal = valor * quantidade;

            total += subtotal;

            System.out.println("Produto: " + nomeProduto);
            System.out.println("Subtotal: R$ " + subtotal);
        }

        // Aplicando desconto
        if (total > 500) {
            desconto = total * 0.15;
        } else if (total > 200) {
            desconto = total * 0.10;
        }

        double totalFinal = total - desconto;

        System.out.println("\n===== RESUMO DA COMPRA =====");
        System.out.println("Total bruto: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total final: R$ " + totalFinal);

        input.close();



    }
}
