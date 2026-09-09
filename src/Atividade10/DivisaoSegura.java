package Atividade10;

import java.util.Scanner;

public class DivisaoSegura {
    static int N1;
    static int N2;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("insira o primeiro numero na divisão");
        N1 = s.nextInt();
        System.out.println("Insira o segundo numero da divisão");
        N2 = s.nextInt();
        try {
            int N3 = N1/N2;
            System.out.println("Valor da divisão: " + N3);
        } catch (ArithmeticException e)
        {
            System.out.println("divisão com zero aconteceu! " + e);
        }
    }
}
