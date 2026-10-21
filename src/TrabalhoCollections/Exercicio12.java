package TrabalhoCollections;

import java.util.*;

public class Exercicio12 {
    public static void main(String[] args) {
        String frase = "Definitivamente eu não sei o que colocar aqui então vou repetir o que possível aqui definitivamente vou";

        Set<String> palavras = new TreeSet<>(Arrays.asList(frase.toLowerCase().split("\\s+")));

        System.out.println("Frase: " + frase);
        System.out.println("Palavras distintas: " + palavras.size());
        System.out.println("Em ordem alfabética: " + palavras);
    }
}
