package Atividade9;
import Atividade9.pokemons.Pokemon;
import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private int idade;
    private String cidadeDeOrigem;
    private List<Pokemon> pokemons;

    public Treinador(String nome, int idade, String cidadeDeOrigem) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeDeOrigem = cidadeDeOrigem;
        pokemons = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPokemon(Pokemon p) {
        pokemons.add(p);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeDeOrigem() {
        return cidadeDeOrigem;
    }

    public void setCidadeDeOrigem(String cidadeDeOrigem) {
        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    // Antes estava vazio. Agora realmente lista os Pokemon do treinador.
    public void listarPokemons() {
        if (pokemons.isEmpty()) {
            System.out.println(nome + " ainda não tem nenhum Pokemon.");
            return;
        }
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println((i + 1) + ". " + pokemons.get(i));
        }
    }

    @Override
    public String toString() {
        return nome + " (idade " + idade + ", de " + cidadeDeOrigem + ") - " + pokemons.size() + " Pokemon(s)";
    }
}