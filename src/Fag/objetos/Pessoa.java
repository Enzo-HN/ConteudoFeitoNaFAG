package Fag.objetos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private double altura;
    LocalDate atual = LocalDate.now();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int ano, int mes, int dia) {
        this.dataDeNascimento = LocalDate.of(ano,mes,dia);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public long idadeAtual()
    {
        return ChronoUnit.YEARS.between(dataDeNascimento, atual);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", altura=" + altura +
                '}';
    }
}
