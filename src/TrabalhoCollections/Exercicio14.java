package TrabalhoCollections;

import java.util.*;

public class Exercicio14 {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        agenda.put("Clever", "9999-1111");
        agenda.put("Claudio", "9999-2222");
        agenda.put("Claudete", "9999-3333");
        agenda.put("Claudito", "9999-4444");
        System.out.println("Agenda " + agenda + "\n");
        System.out.println("Telefone da Claudete: " + agenda.get("Claudete"));

        agenda.put("Claudio", "8888-0000");
        System.out.println("Claudio atualizado: " + agenda.get("Claudio"));

        agenda.remove("Claudito");
        System.out.println("Agenda após remover Claudito: " + agenda);

        System.out.println("containsKey(\"cleber\"): " + agenda.containsKey("cleber"));
    }
}
