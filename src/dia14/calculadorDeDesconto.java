package dia14;

import java.util.Scanner;

public class calculadorDeDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor da sua conta");
        double valor = input.nextDouble();
        double desconto;
        double valorFinal;
        if (valor <= 100) {
            desconto = 0;
            valorFinal = valor - desconto;
            System.out.println("o valor da sua compra é de :" + valorFinal + "e o desconto é de : " + desconto);
        } else if (valor > 100 && valor <= 500) {
            desconto = valor * 0.1;
            valorFinal = valor - desconto;
            System.out.println("o valor da sua compra é de :" + valorFinal + "e o desconto é de : " + desconto);
        } else {
            desconto = valor * 0.2;
            valorFinal = valor - desconto;
            System.out.println("o valor da sua compra é de :" + valorFinal + "e o desconto é de : " + desconto);
        }
    }
}
