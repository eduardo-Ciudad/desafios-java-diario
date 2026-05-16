package dia09;

import java.util.List;
import java.util.Scanner;

public class simulaTroco {
    public static void main(String[] args) {
        int[] notas = {(int) 100.00, (int)50.00, (int) 20.00, (int) 10.00, (int) 5.00, (int) 2.00};

        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor que deve ser retornado o troco");
        int preco = input.nextInt();
        System.out.println("digite a nota que o cliente deu");
        int notaCliente = input.nextInt();
        int valorTroco = notaCliente - preco;
        if (valorTroco < 0) {
            System.out.println("Valor pago é insuficiente.");
            return;
        }

        System.out.println("Troco: R$" + valorTroco);
        System.out.println("Notas entregues:");

        for (int nota : notas) {
            int quantidade = valorTroco / nota;

            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$" + nota);
            }

            valorTroco = valorTroco % nota;
        }

        input.close();
    }

}
