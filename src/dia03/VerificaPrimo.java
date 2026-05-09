package dia03;

import java.util.Scanner;

public class VerificaPrimo {

    public static boolean isPrimo(int num){
        if (num <= 1) {
           return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

       return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        if (isPrimo(num)) {
        System.out.println("Primo");
        } else {
            System.out.println("nao é primo");
        }
    }
    }
