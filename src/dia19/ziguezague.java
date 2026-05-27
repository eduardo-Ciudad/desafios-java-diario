package dia19;

public class ziguezague {
    public static String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }

        StringBuilder[] linhas = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            linhas[i] = new StringBuilder();
        }

        int linhaAtual = 0;
        boolean descendo = false;

        for (char c : s.toCharArray()) {
            linhas[linhaAtual].append(c);

            if(linhaAtual == 0 || linhaAtual == numRows - 1) {
                descendo = !descendo;
            }
        }
        // Movimenta linha
        if (descendo) {
            linhaAtual++;
        } else {
            linhaAtual--;
        }


    // Junta tudo
    StringBuilder resultado = new StringBuilder();

        for (StringBuilder linha : linhas) {
        resultado.append(linha);
    }

        return resultado.toString();
}

public static void main(String[] args) {

    System.out.println(convert("PAYPALISHIRING", 3));
}

}
