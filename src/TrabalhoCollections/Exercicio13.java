package TrabalhoCollections;

import java.util.*;

public class Exercicio13 {

    public static void main(String[] args) {
        Set<Aluno> porIdade = new TreeSet<>();
        porIdade.add(new Aluno("Ana", 0, 20));
        porIdade.add(new Aluno("Bruno", 0 , 22));
        porIdade.add(new Aluno("Carla", 0 , 20));
        porIdade.add(new Aluno("Diego", 0 , 19));

        //tá la no objeto aluno
        System.out.println("O que acontece se dois alunos tiverem a mesma idade no primeiro caso?");
        System.out.println("Ordenado por idade : " + porIdade);
        System.out.println("Carla não entrou: compareTo() retornou 0 para a idade 20, e o TreeSet trata comparação igual a 0 como elemento duplicado.");

        Set<Aluno> porNome = new TreeSet<>(Comparator.comparing(a -> a.nome));
        porNome.add(new Aluno("Ana", 0 ,20));
        porNome.add(new Aluno("Bruno", 0 , 22));
        porNome.add(new Aluno("Carla", 0 , 20));
        porNome.add(new Aluno("Diego", 0 , 19));
        System.out.println("\nOrdenado por nome (Comparator): " + porNome);
    }
}
