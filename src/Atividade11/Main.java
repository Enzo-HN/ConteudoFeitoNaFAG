package Atividade11;

import java.util.Scanner;

public class Main {
    static Academia academia = new Academia();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        teste(); // teste com informações já feitas
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu da Academia");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Instrutor");
            System.out.println("3 - Cadastrar Plano");
            System.out.println("4 - Matricular Aluno em Plano");
            System.out.println("5 - Cadastrar Treino");
            System.out.println("6 - Listar Historico do Aluno");
            System.out.println("7 - Verificar Catraca");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

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
                case 0 -> System.out.println("fechando sistema");
                default -> System.out.println("Opcao invalida");
            }
        }
        s.close();
    }

    static void cadastrarAluno() {
        System.out.print("CPF: ");
        String cpf = s.nextLine();

        if (academia.existeCpf(cpf)) {
            System.out.println("CPF ja cadastrado");
            return;
        }

        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Matricula: ");
        String matricula = s.nextLine();

        academia.cadastrarAluno(new Aluno(nome, cpf, matricula));
        System.out.println("Aluno cadastrado com sucesso");
    }

    static void cadastrarInstrutor() {
        System.out.print("CPF: ");
        String cpf = s.nextLine();

        if (academia.existeCpf(cpf)) {
            System.out.println("CPF ja cadastrado");
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
        System.out.println("Instrutor cadastrado com sucesso");
    }

    static void cadastrarPlano() {
        System.out.print("Nome do plano: ");
        String nome = s.nextLine();
        academia.cadastrarPlano(new Plano(nome, true));
        System.out.println("Plano cadastrado com sucesso");
    }

    static void matricularAluno() {
        if (academia.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }
        System.out.println("\nAlunos Cadastrados");
        for (Aluno a : academia.getAlunos()) {
            System.out.println("Matricula: " + a.getMatricula() + " | Nome: " + a.getNome());
        }

        System.out.print("Digite a matricula do aluno: ");
        Aluno aluno = academia.buscarAlunoPorMatricula(s.nextLine());
        if (aluno == null) {
            System.out.println("Aluno nao encontrado!");
            return;
        }

        if (academia.getPlanos().isEmpty()) {
            System.out.println("Nenhum plano cadastrado!");
            return;
        }

        // Exibe os planos disponiveis
        System.out.println("\n--- Planos Disponiveis ---");
        for (Plano p : academia.getPlanos()) {
            System.out.println("- " + p.getNome());
        }

        System.out.print("Digite o nome do plano escolhido: ");
        String nomePlano = s.nextLine();
        for (Plano p : academia.getPlanos()) {
            if (p.getNome().equalsIgnoreCase(nomePlano)) {
                aluno.matricular(p);
                System.out.println("Aluno matriculado com sucesso!");
                return;
            }
        }
        System.out.println("Plano nao encontrado!");
    }

    static void cadastrarTreino() {
        if (academia.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }
        System.out.println("\nAlunos Cadastrados");
        for (Aluno a : academia.getAlunos()) {
            System.out.println("Matricula: " + a.getMatricula() + " | Nome: " + a.getNome());
        }

        System.out.print("Digite a matricula do aluno: ");
        Aluno aluno = academia.buscarAlunoPorMatricula(s.nextLine());
        if (aluno == null) {
            System.out.println("Aluno nao encontrado!");
            return;
        }

        if (academia.getInstrutores().isEmpty()) {
            System.out.println("Nenhum instrutor cadastrado!");
            return;
        }

        // Exibe os instrutores
        System.out.println("\nInstrutores Disponiveis");
        for (Instrutor i : academia.getInstrutores()) {
            System.out.println("- " + i.getNome());
        }

        System.out.print("Digite o nome do instrutor: ");
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
        if (academia.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.println("\nAlunos Cadastrados");
        for (Aluno a : academia.getAlunos()) {
            System.out.println("Matricula: " + a.getMatricula() + " | Nome: " + a.getNome());
        }

        System.out.print("Digite a matricula do aluno: ");
        academia.listarHistoricoAluno(s.nextLine());
    }

    static void verificarCatraca() {
        if (academia.getAlunos().isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.println("\nAlunos Cadastrados");
        for (Aluno a : academia.getAlunos()) {
            System.out.println("Matricula: " + a.getMatricula() + " | Nome: " + a.getNome());
        }

        System.out.print("Digite a matricula do aluno: ");
        boolean liberado = academia.verificarAcessoCatraca(s.nextLine());
        if (liberado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }


    static void teste() {
        Plano p1 = new Plano("Musculacao", true);
        Plano p2 = new Plano("Natacao", true);
        academia.cadastrarPlano(p1);
        academia.cadastrarPlano(p2);

        Instrutor inst = new Instrutor("roger", "11111111111");
        inst.adicionarEspecialidade("Musculacao");
        academia.cadastrarInstrutor(inst);

        Aluno a1 = new Aluno("teto", "22222222222", "1");
        a1.matricular(p1);
        academia.cadastrarAluno(a1);

        Aluno a2 = new Aluno("carlinhos", "33333333333", "2");
        academia.cadastrarAluno(a2);
    }
}