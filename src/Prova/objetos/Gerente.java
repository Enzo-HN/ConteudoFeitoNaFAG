package Prova.objetos;

public class Gerente extends Pessoa {
    private double percentual;
    private double salarioBase;
    public Gerente(String nome, double salarioBase, double percentual) {
        super(nome, "Gerente");
        setSalarioBase(salarioBase);
        setPercentual(percentual);
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        if (percentual < 0) {
            throw new BonusNegativos("O percentual de bonus do Gerente está negativo");
        }
        else{
            this.percentual = percentual;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new SalarioNegativo("Salario base do Gerente está negativo");
        }
        else {
            this.salarioBase = salarioBase;
        }
    }

    @Override
    public double calcularSalario() {

        return this.salarioBase + ( salarioBase * (percentual / 100));
    }


}
