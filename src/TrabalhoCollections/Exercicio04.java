package TrabalhoCollections;
//não precisava importar separadamente antes, so não sei se faz mal so puxar tudos inves de importar separadamente
import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("AAA", "BBBBB", "CCCCCC", "DDDD", "EEEEEEEEE"));

        Collections.sort(lista);
        System.out.println("Ordem alfabética: " + lista);

        lista.sort(Comparator.comparingInt(String::length));
        System.out.println("Por tamanho: " + lista);
    }
}
