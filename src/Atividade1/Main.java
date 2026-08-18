package Atividade1;

import Atividade1.Objetos.Aluno;
import Atividade1.Objetos.Biblioteca;
import Atividade1.Objetos.Livro;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nSelecione o que deseja fazer dentro do sistema da biblioteca");
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Cadastrar Alunos");
            System.out.println("3 - Realizar empréstimo de livro");
            System.out.println("4 - Realizar devolução de livro");
            System.out.println("5 - Listar livros");
            System.out.println("5 - Listar histórico de empréstimos");
            System.out.println("6 - Sair do sistema");
            opcao = s.nextInt();
            s.nextLine();
            switch (opcao) {
                case 1:
                    realizarCadastroLivros();
                    break;
                case 2:
                    realizarCadastroAlunos();
                    break;
                case 3:
                    realizarEmprestimoLivro();
                    break;
                case 4:
                    realizarDevolucaoLivro();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    biblioteca.listarHistorico();
                case 7:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 6);
        s.close();
    }

    static void realizarCadastroLivros() {
        System.out.println("Cadastro de Livros:");
        System.out.println("Insira o nome do livro que deseja cadastrar");
        String nome = s.nextLine();
        System.out.println("Insira o Autor do livro que deseja cadastrar");
        String autor = s.nextLine();
        System.out.println("Insira o código do livro que deseja cadastrar");
        String codigo = s.nextLine();
        try {
            Livro l = new Livro(nome, autor, codigo);
            biblioteca.cadastrarLivro(l);
            System.out.println(l.imprimirInformacoes());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void realizarCadastroAlunos() {
        System.out.println("Cadastro de alunos:");
        System.out.println("Insira o nome do aluno que deseja cadastrar");
        String nome = s.nextLine();
        System.out.println("Insira a matricula do aluno que deseja cadastrar");
        String matricula = s.nextLine();
        try {
            Aluno a = new Aluno(nome, matricula);
            biblioteca.cadastrarAluno(a);
            System.out.println("Aluno cadastrado com sucesso");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void realizarEmprestimoLivro() {
        if (biblioteca.getAlunosCadastrados().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado ainda");
            return;
        }
        if (biblioteca.getAcervo().isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda");
            return;
        }

        System.out.println("Emprestimo de livro, digite o numero no começo para selecionar e -1 para cancelar");
        System.out.println("Qual aluno deseja pegar o livro emprestado?");
        for (int i = 0; i < biblioteca.getAlunosCadastrados().size(); i++) {
            String texto = biblioteca.getAlunosCadastrados().get(i).imprimirInformacoes();
            System.out.println(i + "-" + texto);
        }
        int aluno = s.nextInt();
        s.nextLine();
        if (aluno == -1) {
            return;
        }

        Aluno a = null;
        if (aluno >= 0 && aluno < biblioteca.getAlunosCadastrados().size()) {
            a = biblioteca.getAlunosCadastrados().get(aluno);
        }
        if (a == null || !a.podePegarEmprestado()) {
            System.out.println("Aluno inválido ou que já atingiu o limite de empréstimos");
            return;
        }

        biblioteca.listarLivrosDisponiveis();
        System.out.println("Selecione o livro que deseja emprestar");
        int livro = s.nextInt();
        s.nextLine();
        if (livro == -1) {
            return;
        }

        Livro l = null;
        if (livro >= 0 && livro < biblioteca.getAcervo().size() && biblioteca.getAcervo().get(livro).isDisponivel()) {
            l = biblioteca.getAcervo().get(livro);
        }

        if (l != null) {
            biblioteca.realizarEmprestimo(a, l);
        } else {
            System.out.println("Livro inválido ou indisponível");
        }
    }

    static void realizarDevolucaoLivro() {
        if (biblioteca.getAcervo().isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda");
            return;
        }

        System.out.println("Devolução de livro, digite -1 para cancelar");
        boolean algumEmprestado = false;
        for (int i = 0; i < biblioteca.getAcervo().size(); i++) {
            if (!biblioteca.getAcervo().get(i).isDisponivel()) {
                algumEmprestado = true;
                String texto = biblioteca.getAcervo().get(i).imprimirInformacoes();
                System.out.println(i + "-" + texto);
            }
        }
        if (!algumEmprestado) {
            System.out.println("Nenhum livro emprestado no momento");
            return;
        }

        int livro = s.nextInt();
        s.nextLine();
        if (livro == -1) {
            return;
        }

        Livro l = null;
        if (livro >= 0 && livro < biblioteca.getAcervo().size() && !biblioteca.getAcervo().get(livro).isDisponivel()) {
            l = biblioteca.getAcervo().get(livro);
        }

        if (l != null) {
            System.out.println("Quantos dias de atraso na devolução? (0 se não houve atraso)");
            int diasAtraso = s.nextInt();
            s.nextLine();
            if (diasAtraso < 0) diasAtraso = 0;
            biblioteca.realizarDevolucao(l, diasAtraso);
        } else {
            System.out.println("Livro inválido ou já disponível.");
        }
    }

    static void listarLivros() {
        biblioteca.listarLivrosDisponiveis();
    }
}