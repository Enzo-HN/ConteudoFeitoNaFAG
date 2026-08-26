package Atividade9;

import Atividade9.pokemons.Pokemon;

public class Batalha {
    public void comecarBatalha(Treinador t1, Pokemon p1, Treinador t2, Pokemon p2) {
        p1.resetar();
        p2.resetar();

        System.out.println("BATALHA INICIADA!!!!!");
        System.out.println("treinador " + t1.getNome() + " mandou " + p1.getNome() + "!");
        System.out.println("treinador " + t2.getNome() + " mandou " + p2.getNome() + "!");

        int quemAtacaPrimeiro = 1;
        while (p1.isVivo() && p2.isVivo()) {
            if (quemAtacaPrimeiro == 1) {
                int atk = p1.Atacar();
                p2.tomarDano(atk, p1.getTipagem());
                quemAtacaPrimeiro = 2;
            } else {
                int atk = p2.Atacar();
                p1.tomarDano(atk, p2.getTipagem());
                quemAtacaPrimeiro = 1;
            }
        }

        if (!p1.isVivo()) {
            System.out.println("TREINADOR " + t2.getNome() + " E " + p2.getNome() + " VENCEU A BATALHA!");
        } else if (!p2.isVivo()) {
            System.out.println("TREINADOR " + t1.getNome() + " E " + p1.getNome() + " VENCEU A BATALHA!");
        } else {
            System.out.println("A BATALHA TEVE UM EMPATE!");
        }
    }
}