package TrabalhoCollections;


import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> iteratorA = lista.iterator();
        while (iteratorA.hasNext())
        {
            if (iteratorA.next() % 2 == 0)
            {
                iteratorA.remove();
            }
        }

        System.out.println("Lista iterator: " + lista);

        lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        lista.removeIf(n -> n % 2 == 0);
        System.out.println("Lista RemoveIF: " + lista);

        //nao sabia como colocar a resposta então vou estar fazendo por mensagem no println
        System.out.println("Explique\n" +
                "por que remover dentro de um for-each lança ConcurrentModificationException.");
        System.out.println("é um erro causado quando uma collection é modificada (nesse caso o remove) quando ela tem um tterator");


    }
}
