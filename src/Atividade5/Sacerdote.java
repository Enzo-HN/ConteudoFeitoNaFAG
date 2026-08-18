package Atividade5;

public class Sacerdote extends Personagem implements Curavel{
    public Sacerdote(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println("Sacerdote " + getNome() + " realizou um ataque sagrado!");
    }
    @Override
    public void curar() {
        System.out.println("Sacerdote " + getNome() + " realizou uma cura sagrada!");
    }
    @Override
    public String toString() {
        return "Sacerdote " + getNome() + ", tem  " + getVida() + " de vida. Nível: " + getNivel() + ".";

    }
}
