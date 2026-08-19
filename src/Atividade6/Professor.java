package Atividade6;

public class Professor {
    private String nome;
    private Aluno orientado;

    public Aluno getOrientado() {
        return orientado;
    }

    public void setOrientado(Aluno orientado) {
        this.orientado = orientado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
    public String exibirOrientado(){
        return "Aluno orientado: " + nome;

    }
}
