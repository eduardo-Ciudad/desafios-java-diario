package dia04;

import java.util.Scanner;

public class ContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma palavra");
        String palavra = scanner.nextLine();
        int totalVogais = 0;
        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'i' || letra == 'a' || letra == 'e' || letra == 'o' || letra == 'u') {
                totalVogais++;
            }

        }
        System.out.println("A palavra '" + palavra + "' tem " + totalVogais + " vogais.");

    }
}
