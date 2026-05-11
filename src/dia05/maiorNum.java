package dia05;

import java.util.Arrays;
import java.util.Scanner;

public class maiorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos numeros vc quer: ");
        int tamanho = input.nextInt();
        int [] numeros = new int [tamanho];

        System.out.println("digite os numeros da lista");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("numero" + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("a soma do array é :" + Arrays.stream(numeros).sum());

        int maior = numeros[0]; // Assume que o primeiro é o maior

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("o maior numero da array é:" + maior);
    }

}
