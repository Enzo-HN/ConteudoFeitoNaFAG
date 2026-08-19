package Atividade7;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Jogador> jogadores;

    public Equipe() {
        jogadores = new ArrayList<>();
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
            jogadores.add(jogador);
    }
    public void removerJogador(Jogador jogador){
        jogadores.remove(jogador);
    }
    public void listarJogadores(){
        for(Jogador jogador : jogadores)
        {
            System.out.println(jogador.getNome());
        }
    }
}
