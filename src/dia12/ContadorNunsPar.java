package dia12;

import java.util.Scanner;

public class ContadorNunsPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 10 numeros");
        int []numeros = new int[10];
        int contadorPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite " + (i + 1) + ":");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Você digitou " + contadorPares + " números pares.");

        sc.close();
    }

}
