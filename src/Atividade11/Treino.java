package Atividade11;

import java.time.LocalDate;

public class Treino {
    private String descricao;
    private LocalDate dataCriacao;
    private Aluno aluno;
    private Instrutor instrutor;

    public Treino(String descricao, Aluno aluno, Instrutor instrutor) {
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.aluno = aluno;
        this.instrutor = instrutor;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public String visualizarFicha() {
        return "Criado em: " + dataCriacao + " | Descricao: " + descricao +
                " | Aluno: " + aluno.getNome() + " | Instrutor: " + instrutor.getNome();
    }
}