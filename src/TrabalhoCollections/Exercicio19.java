package TrabalhoCollections;

import java.util.*;

public class Exercicio19 {
    public static void main(String[] args) {
        String[] pares = {"Ravi-A", "Vijay-B", "Ajay-A", "Amit-B", "Garima-A"};

        Map<String, List<String>> turmas = new TreeMap<>();
        for (String par : pares) {
            String[] partes = par.split("-");
            String aluno = partes[0];
            String turma = partes[1];
            turmas.computeIfAbsent(turma, a -> new ArrayList<>()).add(aluno);
        }

        for (Map.Entry<String, List<String>> e : turmas.entrySet()) {
            System.out.println("Turma " + e.getKey() + ": " + e.getValue());
        }
    }
}
