package Atividade10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcessoVetor {
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a posição do vetor (0 a 4): ");
            int posicao = scanner.nextInt();
            System.out.println("O valor na posição " + posicao + " é: " + vetor[posicao]);
        } catch (InputMismatchException e) {

            System.out.println("Você deve digitar um número inteiro válido. " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Posição errada Escolha um índice entre 0 e 4." + e.getMessage());
        } finally {
            System.out.println("Operação encerrada.");
            scanner.close();
        }
    }
}
