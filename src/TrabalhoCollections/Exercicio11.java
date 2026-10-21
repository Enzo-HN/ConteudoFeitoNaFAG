package TrabalhoCollections;

import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        Set<Character> vistas = new HashSet<>();
        boolean repetida = false;

        for (char c : palavra.toCharArray()) {
            if (!vistas.add(c)) {
                repetida = true;
                break;
            }
        }
        if (repetida) {
            System.out.println("A palavra possui letras repetidas!");
        }
        else
        {
            System.out.println("A palavra não possui letras repetidas!");
        }
    }
}
