package Fag.objetos;

public class Funcionarios {
    private double salario;
    private String nome;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario> 200)
        {
            this.salario = salario;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void aumentaSalario(double quant)
    {
        if (quant > 0 && this.salario > 1000)
        {
            this.salario+= quant;
        }
    }
    private void descontos()
    {
        this.salario -= 12;

    }
    

    @Override
    public String toString() {
        return "Funcionarios{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
