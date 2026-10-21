package TrabalhoCollections;

import java.util.*;

public class Exercicio20 {

    static Scanner s = new Scanner(System.in);
    static Map<Integer, Produto> estoque = new LinkedHashMap<>();
    static Set<String> categorias = new LinkedHashSet<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar por categoria");
            System.out.println("4 - Valor total em estoque");
            System.out.println("5 - Listar categorias");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> remover();
                case 3 -> listarPorCategoria();
                case 4 -> valorTotal();
                case 5 -> System.out.println("Categorias: " + categorias);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void cadastrar() {
        System.out.print("Código: ");
        int codigo = s.nextInt();
        s.nextLine();
        if (estoque.containsKey(codigo)) {
            System.out.println("Já existe um produto com esse código.");
            return;
        }
        System.out.print("Nome: ");
        String nome = s.nextLine().trim();
        System.out.print("Categoria: ");
        String categoria = s.nextLine().trim();
        System.out.print("Preço: ");
        double preco = s.nextDouble();
        s.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = s.nextInt();
        s.nextLine();

        estoque.put(codigo, new Produto(codigo, nome, categoria, preco, quantidade));
        categorias.add(categoria);
        System.out.println("Produto cadastrado.");
    }

    static void remover() {
        System.out.print("Código do produto a remover: ");
        int codigo = s.nextInt();
        s.nextLine();
        if (estoque.remove(codigo) == null) {
            System.out.println("Código não encontrado.");
            return;
        }
        categorias.clear();
        for (Produto p : estoque.values()) categorias.add(p.getCategoria());
        System.out.println("Produto removido.");
    }

    static void listarPorCategoria() {
        System.out.print("Categoria: ");
        String categoria = s.nextLine().trim();

        List<Produto> resultado = new ArrayList<>();
        for (Produto p : estoque.values()) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) resultado.add(p);
        }
        resultado.sort(Comparator.comparingDouble(Produto::getPreco));

        if (resultado.isEmpty()) System.out.println("Nenhum produto encontrado.");
        else resultado.forEach(System.out::println);
    }

    static void valorTotal() {
        double total = 0;
        for (Produto p : estoque.values()) total += p.getPreco() * p.getQuantidade();
        System.out.printf("Valor total em estoque: R$ %.2f%n", total);
    }




}
