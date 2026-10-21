package TrabalhoCollections;

import java.util.*;

public class Exercicio07 {



    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(List.of(
                new Aluno("Ana", 8.5, 0),
                new Aluno("Bruno", 6.0, 0),
                new Aluno("Carla", 9.2, 0),
                new Aluno("Diego", 4.5, 0),
                new Aluno("Elisa", 7.0, 0),
                new Aluno("Fábio", 5.8, 0)));

        alunos.sort((x, y) -> Double.compare(y.nota, x.nota));

        System.out.println("Aprovados:");
        for (Aluno a : alunos) if (a.nota >= 7) System.out.println("  " + a);

        System.out.println("Reprovados:");
        for (Aluno a : alunos) if (a.nota < 7) System.out.println("  " + a);
    }
}
