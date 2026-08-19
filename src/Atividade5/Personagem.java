package Atividade5;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void atacar(){
        System.out.println("O personagem atacou");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
