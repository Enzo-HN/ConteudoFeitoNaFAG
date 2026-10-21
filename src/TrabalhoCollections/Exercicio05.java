package TrabalhoCollections;

import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        List<Integer> invertida = new ArrayList<>(lista);
        for (int i = 0, j = invertida.size() - 1; i < j; i++, j--) {
            int num = invertida.get(i);
            invertida.set(i, invertida.get(j));
            invertida.set(j, num);
        }
        System.out.println("Sem Collections.reverse " + invertida);

        List<Integer> pronta = new ArrayList<>(lista);
        Collections.reverse(pronta);
        System.out.println("Com Collections.reverse " + pronta);

    }
}
