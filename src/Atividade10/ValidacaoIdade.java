package Atividade10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();
            if (idade < 0 || idade > 120) {
                throw new InputMismatchException("Você deve digitar um número inteiro válido.");
            }
            System.out.println("Idade válida cadastrada com sucesso: " + idade + " anos.");

        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
