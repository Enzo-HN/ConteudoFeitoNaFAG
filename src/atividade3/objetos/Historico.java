package atividade3.objetos;
import java.util.ArrayList;

public class Historico {

    private ArrayList<RegistroOperacao> registros = new ArrayList<>();

    public void adicionar(RegistroOperacao registro) {
        registros.add(registro);
    }

    public void limpar() {
        registros.clear();
    }

    public boolean estaVazio() {
        return registros.isEmpty();
    }

    public ArrayList<RegistroOperacao> listar() {
        return new ArrayList<>(registros);
    }
    public double obterUltimoResultado() {
        if (estaVazio()) {
            throw new IllegalStateException("Nao ha operacoes no historico ainda.");
        }
        return registros.getLast().getResultado();
    }
}
