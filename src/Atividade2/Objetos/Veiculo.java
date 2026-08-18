package Atividade2.Objetos;

public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
    private boolean disponivel;

    public Veiculo(String m, String p) {
        setModelo(m);
        setCor(p);
        this.disponivel = true;

    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void alugar() {

    }
    public void devolver() {

    }

}
