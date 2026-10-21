package TrabalhoCollections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Clever", "Cleber", "Claudeo", "Claudete", "Cloud"));

        System.out.println("foreach:");
        for (String n : nomes)
        {
            System.out.println(n);
        }

        System.out.println("Iterator:");
        Iterator<String> it = nomes.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
