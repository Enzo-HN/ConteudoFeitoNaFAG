package Atividade11;

import java.util.Scanner;

public class Main {
    static Academia academia = new Academia();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu da academia:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Instrutor");
            System.out.println("3 - Cadastrar Plano");
            System.out.println("4 - Matricular Aluno");
            System.out.println("5 - Cadastrar Treino");
            System.out.println("6 - Listar Historico do Aluno");
            System.out.println("7 - Verificar Catraca");
            System.out.println("0 - Sair");

            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> cadastrarInstrutor();
                case 3 -> cadastrarPlano();
                case 4 -> matricularAluno();
                case 5 -> cadastrarTreino();
                case 6 -> listarHistoricoAluno();
                case 7 -> verificarCatraca();
                case 0 -> System.out.println("fechando sistema.");
                default -> System.out.println("Opcao invalida.");
            }
        }
        s.close();
    }

    static void cadastrarAluno() {
        System.out.print("CPF: ");
        String cpf = s.nextLine();

        if (academia.existeCpf(cpf)) {
            System.out.println("CPF ja cadastrado!");
            return;
        }

        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Matricula: ");
        String matricula = s.nextLine();

        academia.cadastrarAluno(new Aluno(nome, cpf, matricula));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    static void cadastrarInstrutor() {
        System.out.print("CPF: ");
        String cpf = s.nextLine();
        if (academia.existeCpf(cpf)) {
            System.out.println("Erro: CPF ja cadastrado!");
            return;
        }

        System.out.print("Nome: ");
        String nome = s.nextLine();

        Instrutor instrutor = new Instrutor(nome, cpf);
        System.out.print("Especialidade: ");
        String esp = s.nextLine();
        if (!esp.isBlank()) {
            instrutor.adicionarEspecialidade(esp);
        }

        academia.cadastrarInstrutor(instrutor);
        System.out.println("Instrutor cadastrado com sucesso!");
    }

    static void cadastrarPlano() {
        System.out.print("Nome do plano: ");
        String nome = s.nextLine();
        academia.cadastrarPlano(new Plano(nome, true));
        System.out.println("Plano cadastrado com sucesso!");
    }

    static void matricularAluno() {
        System.out.print("Matricula do aluno: ");
        Aluno aluno = academia.buscarAlunoPorMatricula(s.nextLine());
        if (aluno == null) {
            System.out.println("Aluno nao encontrado!");
            return;
        }

        System.out.print("Nome do plano: ");
        String nomePlano = s.nextLine();
        for (Plano p : academia.getPlanos()) {
            if (p.getNome().equals(nomePlano)) {
                aluno.matricular(p);
                System.out.println("Aluno matriculado com sucesso!");
                return;
            }
        }
        System.out.println("Plano nao encontrado!");
    }

    static void cadastrarTreino() {
        System.out.print("Matricula do aluno: ");
        Aluno aluno = academia.buscarAlunoPorMatricula(s.nextLine());
        if (aluno == null) {
            System.out.println("Aluno nao encontrado!");
            return;
        }

        System.out.print("Nome do instrutor: ");
        Instrutor instrutor = academia.buscarInstrutorPorNome(s.nextLine());
        if (instrutor == null) {
            System.out.println("Instrutor nao encontrado!");
            return;
        }

        System.out.print("Descricao do treino: ");
        String desc = s.nextLine();

        academia.cadastrarTreino(new Treino(desc, aluno, instrutor));
        System.out.println("Treino cadastrado com sucesso!");
    }

    static void listarHistoricoAluno() {
        System.out.print("Matricula do aluno: ");
        academia.listarHistoricoAluno(s.nextLine());
    }

    static void verificarCatraca() {
        System.out.print("Matricula do aluno: ");
        boolean liberado = academia.verificarAcessoCatraca(s.nextLine());
        if (liberado) {
            System.out.println("Acesso permitido");
        }
        else  {
            System.out.println("Acesso negado");
        }
    }
}