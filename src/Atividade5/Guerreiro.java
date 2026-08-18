package Atividade5;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro " + nome + " atacou com uma espada!");
    }
    @Override
    public String toString() {
        return "Guerreiro " + nome + ", tem  " + vida + " de vida. Nível: " + nivel + ".";

    }
}
