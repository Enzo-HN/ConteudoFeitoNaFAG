package Atividade9.pokemons;

public class PokemonFogo extends Pokemon {

    public PokemonFogo(int HP, String nome, int atk, int defesa) {
        super(HP, nome, atk, defesa, "fogo");
    }

    @Override
    public int Atacar() {
        System.out.println(nome + " usou Lança-Chamas!");
        return atk;
    }

    @Override
    public void tomarDano(int atk, String tipagem) {
        int dano;
        if (tipagem.equals("água")) {
            dano = (atk - defesa) * 2;
            if (dano <= 0) {
                dano = 1;
            }
            this.HP -= dano;
            System.out.println(nome + " tomou dano superefetivo!");
            if (this.HP <= 0) {
                System.out.println(nome + " desmaiou.");
                vivo = false;
            }
        } else if (tipagem.equals("grama")) {
            dano = (int) Math.round((atk - defesa) * 0.5);
            if (dano <= 0) {
                dano = 1;
            }
            this.HP -= dano;
            System.out.println(nome + " resistiu o dano!!");
            if (this.HP <= 0) {
                System.out.println(nome + " desmaiou.");
                vivo = false;
            }
        } else {
            dano = (atk - defesa) * 1;
            if (dano <= 0) {
                dano = 1;
            }
            this.HP -= dano;
            System.out.println(nome + " tomou dano!");
            if (this.HP <= 0) {
                System.out.println(nome + " desmaiou.");
                vivo = false;
            }
        }
    }
}