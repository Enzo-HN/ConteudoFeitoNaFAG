package TrabalhoCollections;

import java.util.*;

public class Exercicio18 {
    public static void main(String[] args) {
        int[] chaves = {100, 3, 47, 16};
        String[] valores = {"cem", "três", "quarenta e sete", "dezesseis"};

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < chaves.length; i++) {
            hashMap.put(chaves[i], valores[i]);
            linkedHashMap.put(chaves[i], valores[i]);
            treeMap.put(chaves[i], valores[i]);
        }

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);

        System.out.println("\nHashMap: ordem depende do hash das chaves");
        System.out.println("LinkedHashMap: mantém a ordem de inserção");
        System.out.println("TreeMap: ordena pelas chaves");
    }
}
