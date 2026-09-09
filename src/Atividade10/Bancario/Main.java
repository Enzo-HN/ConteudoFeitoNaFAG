package Atividade10.Bancario;

import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("roger", 2.00);
        Scanner s = new Scanner(System.in);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Inicial de R$ " + conta.getSaldo());
        try {
            System.out.println("Insira o valor que deseja sacar: ");
            conta.sacar(s.nextDouble());
            System.out.println("Novo Saldo: R$ " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}

