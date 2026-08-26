package Atividade9.pokemons;

public abstract class Pokemon {
    protected int HP;
    protected int maxHP;
    protected String nome;
    protected int atk;
    protected int defesa;
    protected boolean vivo = true;
    private String tipagem;

    public Pokemon(int HP, String nome, int atk, int defesa, String tipagem) {
        this.HP = HP;
        this.maxHP = HP;
        this.nome = nome;
        this.atk = atk;
        this.defesa = defesa;
        this.tipagem = tipagem;
    }
    public abstract void tomarDano(int atk, String tipagem);

    public String getTipagem() {
        return tipagem;
    }

    public boolean isVivo() {
        return vivo;
    }
    public void resetar() {
        this.HP = this.maxHP;
        this.vivo = true;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int Atacar() {
        System.out.println(nome + " atacou!");
        return this.atk;
    }

    @Override
    public String toString() {
        return nome + " [" + tipagem + "], tem " + HP + "/" + maxHP + " de vida. atk: " + atk + ". defesa: " + defesa;
    }
}