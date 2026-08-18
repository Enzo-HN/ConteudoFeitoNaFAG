package Atividade5;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    @Override
    public void atacar() {
        System.out.println("Arqueiro " + getNome() + " disparou uma flecha!");
    }
    @Override
    public String toString() {
        return "Arqueiro " + getNome() + ", tem  " + getVida() + " de vida. Nível: " + getNivel() + ".";

    }

}
