package Atividade10.CadastroDeProduto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("\nDigite o nome do produto: ");
                String nome = s.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco = s.nextDouble();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = s.nextInt();
                Produto produto = new Produto(nome, preco, quantidade);
                listaProdutos.add(produto);
                System.out.println("Produto cadastrado com sucesso!");

            } catch (NomeInvalidoException | PrecoInvalidoException | QuantidadeInvalidaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Processamento da tentativa de cadastro finalizado.");
            }

            System.out.println("Continuar? (S/N): ");
            s.nextLine();
            String resposta = s.nextLine();
            if (resposta.equals("N")) {
                continuar = false;
            }
        }
        s.close();
    }
}

