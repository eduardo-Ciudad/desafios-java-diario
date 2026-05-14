package dia08;

import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] palavras) {
        if (palavras == null || palavras.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> mapDeAnagramas = new HashMap<>();

        for (String palavra : palavras) {
            char[] charArray = palavra.toCharArray();
            Arrays.sort(charArray);
            String chave = new String(charArray);
            if (!mapDeAnagramas.containsKey(chave)) {
                mapDeAnagramas.put(chave, new ArrayList<>());

            }
        }
        return new ArrayList<>(mapDeAnagramas.values());
    }







    public static void main(String[] args) {
        String[] anagramas = {"ada", "ded" , "awd", "iuj", "uji"};

        List<List<String>> anagrams = groupAnagrams(anagramas);

        for (List<String> grupo : anagrams) {
            System.out.println(Arrays.asList(anagramas));
        }
    }


}
