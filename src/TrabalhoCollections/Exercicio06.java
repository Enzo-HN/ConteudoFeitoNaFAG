package TrabalhoCollections;

import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> arrayList = new ArrayList<>();
        long inicio = System.nanoTime();
        for (int i = 0; i < n; i++) arrayList.add(0, i);
        long tempoArray = System.nanoTime() - inicio;

        List<Integer> linkedList = new LinkedList<>();
        inicio = System.nanoTime();
        for (int i = 0; i < n; i++) linkedList.add(0, i);
        long tempoLinked = System.nanoTime() - inicio;

        System.out.println("ArrayList:  " + tempoArray / 1000000 + " ms");
        System.out.println("LinkedList: " + tempoLinked / 1000000 + " ms");

        System.out.println("\nExplique a diferença de tempo entre os dois metodos");
        System.out.println("ArrayList move o conteudo para adicionar um novo numero");
        System.out.println("LinkedList por ser em nós encadeados (baseado em ponteiros), não precisando mover os dados, que acaba sendo mais rapido");
    }
}
