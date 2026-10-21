package TrabalhoCollections;

import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> b = new TreeSet<>(Set.of(4, 5, 6, 7));

        Set<Integer> uniao = new TreeSet<>(a);
        uniao.addAll(b);

        Set<Integer> intersecao = new TreeSet<>(a);
        intersecao.retainAll(b);

        Set<Integer> diferenca = new TreeSet<>(a);
        diferenca.removeAll(b);

        System.out.println("A = " + a + "  B = " + b);
        System.out.println("União:      " + uniao);
        System.out.println("Interseção: " + intersecao);
        System.out.println("A - B:      " + diferenca);
    }
}
