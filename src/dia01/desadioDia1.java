package dia01;

import java.util.Scanner;

public class desadioDia1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = scanner.nextInt();

        if (num%2 == 0){
            System.out.println("seu numero é par");
        }else {
            System.out.println("é impar");
        }
    }
}
