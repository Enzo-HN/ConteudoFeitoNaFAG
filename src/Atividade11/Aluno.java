package Atividade11;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private boolean ativo;
    private Plano plano;
    private List<Treino> treinos;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.ativo = true;
        this.plano = null;
        this.treinos = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Plano getPlano() {
        return plano;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void matricular(Plano p) {
        this.plano = p;
    }

    public void adicionarTreinos(Treino t) {
        this.treinos.add(t);
    }

    public boolean estaEmDia() {
        return ativo && (plano != null && plano.estaEmDia());
    }

    public String consultarHistorico() {
        String historico = "Matricula: " + matricula + " | Nome: " + getNome() + "\n";
        historico += "Status: " + (ativo ? "Ativo" : "Inativo") + "\n";
        historico += "Plano: " + (plano != null ? plano.consultarHistorico() : "Nenhum") + "\n";
        historico += "Treinos:\n";

        if (treinos.isEmpty()) {
            historico += " - Nenhum treino registrado.\n";
        } else {
            for (Treino t : treinos) {
                historico += " - " + t.visualizarFicha() + "\n";
            }
        }

        return historico;
    }
}