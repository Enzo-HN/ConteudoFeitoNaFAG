package Prova.objetos;

public class Professor extends Pessoa {
    private int horas;
    private double recebidoPorHora;
    public Professor(String nome, double recebidoPorHora, int horas) {
        super(nome, "Professor");
        setHoras(horas);
        setRecebidoPorHora(recebidoPorHora);
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {

        if (horas <= 0) {
            throw new HorasNegativas("Horas trabalhadas pelo Professor está negativo");
        }
        else  {
            this.horas = horas;
        }
    }

    @Override
    public double calcularSalario() {
        return recebidoPorHora * horas;
    }

    public double getRecebidoPorHora() {
        return recebidoPorHora;
    }

    public void setRecebidoPorHora(double recebidoPorHora) {
        if (recebidoPorHora <= 0) {
            throw new HorasNegativas("Salario recebido pelo Professor está negativo");
        }
        else {
            this.recebidoPorHora = recebidoPorHora;
        }
    }
}
