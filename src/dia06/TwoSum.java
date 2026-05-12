package dia06;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos numeros vc quer: ");
        int tamanho = input.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("digite os numeros da lista");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("numero" + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
        System.out.println("digite o valor alvo");
        int valorAlvo = input.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[i] + numeros[j] == valorAlvo) {
                    System.out.println("endices encontrados" + i + "e" + j);
                    System.out.println("Valores: " + numeros[i] + " + " + numeros[j]);
                    encontrado = true;
                    break;
                }
                if (encontrado) {
                    break;
                }
            }
        }
    }
}
