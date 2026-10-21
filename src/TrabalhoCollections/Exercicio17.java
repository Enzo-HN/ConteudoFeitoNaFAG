package TrabalhoCollections;

import java.util.*;

public class Exercicio17 {
    public static void main(String[] args) {
        Map<String, Double> carrinho = new LinkedHashMap<>();
        carrinho.put("Arroz", 25.90);
        carrinho.put("Feijão", 8.50);
        carrinho.put("Leite", 5.20);
        carrinho.put("Café", 18.75);
        carrinho.put("Açúcar", 4.99);

        System.out.println("Percorrendo com keySet():");
        for (String produto : carrinho.keySet())
        {
            System.out.println("  " + produto);
        }

        System.out.println("Percorrendo com values():");
        for (double preco : carrinho.values())
        {
            System.out.println("  R$ " + preco);
        }

        double total = 0;
        double maiorPreco = -1;
        String maisCaro = "";

        System.out.println("Percorrendo com entrySet():");
        for (Map.Entry<String, Double> e : carrinho.entrySet()) {
            System.out.println("  " + e.getKey() + " = R$ " + e.getValue());
            total += e.getValue();
            if (e.getValue() > maiorPreco) {
                maiorPreco = e.getValue();
                maisCaro = e.getKey();
            }
        }

        System.out.printf("Valor total: R$ %.2f%n", total);
        System.out.println("Produto mais caro: " + maisCaro + " (R$ " + maiorPreco + ")");
    }
}
