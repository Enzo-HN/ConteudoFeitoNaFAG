package Atividade1.Objetos;

public class Aluno {
    private String nome;
    private String matricula;
    private int limiteEmprestimos = 3;
    private int quantidadeEmprestada;

    public Aluno(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do aluno inserido está em branco");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Codigo da matricula inserida está em branco");
        }
        this.matricula = matricula;
    }

    public void setQuantidadeEmprestada(int quant) {
        this.quantidadeEmprestada += quant;
    }

    public boolean podePegarEmprestado() {
        return this.quantidadeEmprestada < this.limiteEmprestimos;
    }

    public String imprimirInformacoes() {
        return " Aluno " + this.nome + ": Matricula " + this.matricula + " emprestou " + this.quantidadeEmprestada + " livros.";
    }
}