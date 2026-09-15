package Prova.objetos;

public abstract class Pessoa {
    protected String nome;
    protected String tipo;
    public Pessoa(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return tipo + ": " + nome;
    }
}
