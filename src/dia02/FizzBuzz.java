package dia02;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 0; num < 100; num++) {
            if (num % 3 == 0) {
                System.out.println(num + "Fizz");
            } else if (num % 5 == 0) {
                System.out.println(num + "Buzz");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + "FizzBuzz");
            } else
                System.out.println(num);


        }
    }
}