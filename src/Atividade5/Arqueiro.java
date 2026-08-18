package Atividade5;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    @Override
    public void atacar() {
        System.out.println("Arqueiro " + nome + " disparou uma flecha!");
    }
    @Override
    public String toString() {
        return "Arqueiro " + nome + ", tem  " + vida + " de vida. Nível: " + nivel + ".";

    }

}
