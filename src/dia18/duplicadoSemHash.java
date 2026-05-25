package dia18;

public class duplicadoSemHash {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 4};
        int duplicado = -1;
        for (int i = 1; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = i;
                    break;
                }
                if (duplicado != -1)  {
                    break;
                }
            }

        }
        System.out.println("o numero duplicado " + duplicado);
    }

}
