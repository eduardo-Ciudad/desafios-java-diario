package dia07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = {"Ana", "Bruno", "Carlos", "Ana"};

        Set<String> lista = new HashSet<>(Arrays.asList(nomes));

        if (lista.size() < nomes.length) {
            System.out.println("essa array tem nomes duplicados");
        } else {
            System.out.println("nao tem duplicados");
        }
    }
}
