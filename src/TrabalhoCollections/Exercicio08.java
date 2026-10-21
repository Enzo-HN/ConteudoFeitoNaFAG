package TrabalhoCollections;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        List<String> lista = List.of("Ravi", "Vijay", "Ravi", "Ajay", "Vijay");

        Set<String> hash = new HashSet<>(lista);
        System.out.println("HashSet (sem ordem garantida): " + hash);

        Set<String> linked = new LinkedHashSet<>(lista);
        System.out.println("LinkedHashSet (mantém a ordem original): " + linked);
    }
}
