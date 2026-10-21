package TrabalhoCollections;

import java.util.*;

public class Exercicio15 {
    public static void main(String[] args) {
        String frase = "Já procurou alguma vez hotel na internet " +
                "Você reparou a quantidade de preços diferentes que o mesmo quarto pode ter \n" +
                "Em vez de perder horas procurando deixe que o Trivago facilite a sua busca pelo hotel ideal com o melhor preço \n" +
                "Trivago compara os preços de mais de setecentos mil hotéis e mais de duzentos sites de reserva de uma só vez \n" +
                "Hotel Trivago \n";

        Map<String, Integer> frequencia = new TreeMap<>();
        for (String palavra : frase.split("\\s+")) {
            frequencia.merge(palavra, 1 , Integer::sum);
        }

        System.out.println("Frase: " + frase);
        for (Map.Entry<String, Integer> e : frequencia.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
