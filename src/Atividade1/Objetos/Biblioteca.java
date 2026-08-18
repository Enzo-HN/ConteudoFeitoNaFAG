package Atividade1.Objetos;
import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Livro> acervo = new ArrayList<Livro>();
    private ArrayList<Aluno> alunosCadastrados = new ArrayList<Aluno>();
    private ArrayList<String> historicoEmprestimos = new ArrayList<String>();

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public ArrayList<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public void cadastrarLivro(Livro livro) {
        boolean codigoIgual = false;
        for (Livro l : acervo) {
            if (Objects.equals(livro.getCodigo(), l.getCodigo())) {
                codigoIgual = true;
                System.out.println("Livro com esse código já cadastrado. Não pode existir códigos identicos");
                break;
            }
        }
        if (!codigoIgual) {
            acervo.add(livro);
        }
    }

    public void cadastrarAluno(Aluno aluno) {
        boolean matriculaIgual = false;
        for (Aluno a : alunosCadastrados) {
            if (Objects.equals(aluno.getMatricula(), a.getMatricula())) {
                matriculaIgual = true;
                System.out.println("Aluno com essa matricula já cadastrado. Não pode existir matrículas identicas");
                break;
            }
        }
        if (!matriculaIgual) {
            alunosCadastrados.add(aluno);
        }
    }

    public void realizarEmprestimo(Aluno aluno, Livro livro) {
        if (aluno == null || livro == null) {
            System.out.println("Aluno ou livro inválido");
            return;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo");
            return;
        }
        if (!aluno.podePegarEmprestado()) {
            System.out.println("Aluno atingiu o limite de empréstimos simultâneos");
            return;
        }
        livro.emprestar(aluno);
        aluno.setQuantidadeEmprestada(1);
        System.out.println("Empréstimo realizado com sucesso");

        historicoEmprestimos.add("EMPRÉSTIMO -> Livro: " + livro.getTitulo()
                + " (código " + livro.getCodigo() + ") | Aluno: " + aluno.getNome()
                + " (matrícula " + aluno.getMatricula() + ")");
    }

    public void realizarDevolucao(Livro livro, int diasAtraso) {
        if (livro.isDisponivel()) {
            System.out.println("Este livro não está emprestado");
            return;
        }

        Aluno aluno = livro.getEmprestador();
        String nomeAluno = aluno != null ? aluno.getNome() : "desconhecido";

        livro.devolver();
        System.out.println("Devolução realizada com sucesso");

        String registro = "DEVOLUÇÃO -> Livro: " + livro.getTitulo()
                + " (código " + livro.getCodigo() + ") | Aluno: " + nomeAluno;

        if (diasAtraso > 0) {
            double valorPorDia = 1.50;
            double multa = diasAtraso * valorPorDia;
            System.out.println("Devolução com " + diasAtraso + " dia(s) de atraso. Multa: R$ " + multa);
            registro += " | Atraso: " + diasAtraso + " dia(s) | Multa: R$ " + multa;
        } else {
            registro += " | Sem atraso";
        }

        historicoEmprestimos.add(registro);
    }

    public void listarLivrosDisponiveis() {
        for (Livro l : this.acervo) {
            if (l.isDisponivel()) {
                String i = l.imprimirInformacoes();
                System.out.println(acervo.indexOf(l) + "-" + i);
            }
        }
    }

    public void listarHistorico() {
        if (historicoEmprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo ou devolução registrado ainda");
            return;
        }
        for (String registro : historicoEmprestimos) {
            System.out.println(registro);
        }
    }
}