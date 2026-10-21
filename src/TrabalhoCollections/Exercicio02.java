package TrabalhoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(5, 12, 8, 3, 27, 14, 9, 1, 20, 6));
        int soma = 0;
        for (int n : numeros)
        {
            soma += n;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (double) soma / numeros.size());
        System.out.println("Maior: " + Collections.max(numeros));
        System.out.println("Menor: " + Collections.min(numeros));
    }
}
