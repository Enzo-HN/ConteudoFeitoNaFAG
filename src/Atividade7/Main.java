package Atividade7;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("claudio");
        Jogador jogador2 = new Jogador("Roberto");
        Equipe time = new Equipe();
        time.adicionarJogador(jogador);
        time.adicionarJogador(jogador2);
        time.listarJogadores();
        time.removerJogador(jogador2);
        time.listarJogadores();
        Equipe time2 = new Equipe();
        time2.adicionarJogador(jogador2);
    }
}
