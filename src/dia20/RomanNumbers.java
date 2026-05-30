package dia20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumbers {


    public static int romanToInt(String s) {

        Map<Character, Integer> mapa = new HashMap<>();

        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int resultado = 0;

        for (int i = 0; i < s.length() - 1;  i++) {

            int atual = mapa.get(s.charAt(i));
            int proximo = mapa.get(s.charAt(i + 1));

            if (atual < proximo) {
                resultado -= atual;
            } else {
                resultado += atual;
            }
        }
        resultado += mapa.get(s.charAt(s.length() - 1));

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero romano: ");
        String romano = sc.nextLine();

        int resultado = romanToInt(romano);

        System.out.println(resultado);
    }
}
