package Fag.objetos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JogadorDeFutebol {
    private String nome;
    private String posicao;
    private LocalDate dataDeNascimento;
    private double altura;
    private double peso;
    private LocalDate atual = LocalDate.now();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int ano, int mes, int dia) {
        this.dataDeNascimento = LocalDate.of(ano, mes, dia);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long idadeAtual()
    {
        return ChronoUnit.YEARS.between(dataDeNascimento, atual);
    }
    public LocalDate tempoAposentar()
    {
        return dataDeNascimento;
    }


    @Override
    public String toString() {
        return "JogadorDeFutebol{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
