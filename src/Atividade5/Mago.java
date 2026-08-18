package Atividade5;

public class Mago extends Personagem{
    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    @Override
    public void atacar() {
        System.out.println("Mago " + nome + " lançou uma bola de fogo!");
    }
    @Override
    public String toString() {
        return "Mago " + nome + ", tem  " + vida + " de vida. Nível: " + nivel + ".";
    }

}
