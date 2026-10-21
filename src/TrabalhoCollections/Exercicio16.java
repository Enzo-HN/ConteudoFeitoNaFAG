package TrabalhoCollections;

import java.util.*;

public class Exercicio16 {
    public static void main(String[] args) {
        String palavra = "paralelepipedo";

        Map<Character, Integer> frequencia = new TreeMap<>();
        for (char c : palavra.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        System.out.println("Palavra: " + palavra);
        System.out.println(frequencia);
    }
}
