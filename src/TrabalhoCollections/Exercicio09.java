package TrabalhoCollections;

import java.util.*;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Uva", "Banana", "Abacaxi"};

        Set<String> hashSet = new HashSet<>(List.of(frutas));
        Set<String> linkedHashSet = new LinkedHashSet<>(List.of(frutas));
        Set<String> treeSet = new TreeSet<>(List.of(frutas));

        System.out.println("HashSet:       " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet:       " + treeSet);

        System.out.println("\nHashSet não garante ordem (depende do hash dos elementos)");
        System.out.println("LinkedHashSet mantém a ordem de inserção");
        System.out.println("TreeSet mantém os elementos ordenados (no caso alfabética)");
    }
}
