package Atividade11;

public class Plano {
    private String nome;
    private boolean ativo;

    public Plano(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String consultarHistorico() {
        return "Plano: " + nome + " | Status: " + (ativo ? "Ativo" : "Inativo");
    }

    public boolean estaEmDia() {
        return ativo;
    }
}