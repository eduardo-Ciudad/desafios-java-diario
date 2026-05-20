package dia13;

import java.util.Scanner;

public class ContadorImc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite sua altura:");
        float altura = input.nextFloat();
        System.out.println("digite sua peso:");
        float peso = input.nextFloat();

        float imc = (float) (peso / Math.pow( altura, 2.0));

        String resultadoImc;
        if (imc < 18.5) {
            resultadoImc = "abaixo do peso";
        } else if(imc > 18.5 && imc < 25) {
            resultadoImc = "peso normal";
        }
        else {
            resultadoImc = "acima da peso";
        }
        System.out.println("seu IMC é :" + imc +
        "vc está:" + resultadoImc);
    }
}
