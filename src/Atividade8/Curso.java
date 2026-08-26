package Atividade8;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private List<Aluno> alunos;

    public Curso(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void matricularAlunos(String nome, String matricula, Curso curso) {
        if(curso == null)
        {
            System.out.println("aluno sem curso digitado.");
        }
        else {
            Aluno aluno = new Aluno(nome, matricula, curso);
            alunos.add(aluno);
        }

    }
    public void listarAlunos(){
        for(Aluno aluno : alunos)
        {
            System.out.println(aluno.getNome() + " está nesse curso.");
        }
    }
}
class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        setCurso(curso);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
