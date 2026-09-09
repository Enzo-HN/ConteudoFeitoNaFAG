package Atividade11;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {
    private List<String> especialidades;

    public Instrutor(String nome, String cpf) {
        super(nome, cpf);
        this.especialidades = new ArrayList<>();
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void adicionarEspecialidade(String esp) {
        this.especialidades.add(esp);
    }


}