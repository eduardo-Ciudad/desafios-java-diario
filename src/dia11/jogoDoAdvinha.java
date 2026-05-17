package dia11;

import java.util.Random;
import java.util.Scanner;

public class jogoDoAdvinha {

    //Criar um programa que:
    //
    //Escolha uma palavra secreta (definida no código).
    //Mostre a palavra com _ no lugar das letras.
    //Peça ao usuário para digitar uma letra.
    //Revele as letras corretas.
    //Conte o número de tentativas.
    //Finalize quando o usuário acertar toda a palavra ou atingir o limite de erros.

    public static void main(String[] args) {
        String palavraSecreta = "PROGRAMACAO";
        Random random = new Random();
        Scanner input = new Scanner(System.in);



        char[] letraDescoberta = new char[palavraSecreta.length()];
        for (int i = 0; i < letraDescoberta.length; i++) {
            letraDescoberta[i] = '_';
        }

        int erros = 0;
        int maxErros = 10;
        boolean acertou = false;

        System.out.println("bem vindo ao jogo da forca");
        while (erros < maxErros && !acertou) {
            System.out.println("\nPalavra: " + new String(letraDescoberta));
            System.out.print("Digite uma letra: ");
            String letra = input.nextLine();
            char palpite = letra.charAt(0);

            Boolean letraEncontrada = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == palpite) {
                    letraDescoberta[i] = palpite;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                erros++;
                System.out.println("Letra errada! vc tem " + (maxErros - erros));
            }else {
                System.out.println("voce acertou a letra!");
            }

            String palavraAtual = new String (letraDescoberta);
            if (palavraAtual.equals(palavraSecreta)) {
                acertou = true;
            }
        }

    }
}
