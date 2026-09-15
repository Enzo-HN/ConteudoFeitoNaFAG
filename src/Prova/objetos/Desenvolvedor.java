package Prova.objetos;

public class Desenvolvedor extends Pessoa {
    private double bonus;
    private double salarioBase;
    public Desenvolvedor(String nome, double salarioBase, double bonus) {
        super(nome, "Desenvolvedor");
        setSalarioBase(salarioBase);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
       if (bonus < 0) {
           throw new BonusNegativos("Bonus de salário do desenvolvedor está negativo");
       }
       else  {
           this.bonus = bonus;
       }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new SalarioNegativo("Salario base do Desenvolvedor está negativo");
        }
        else   {
            this.salarioBase = salarioBase;
        }
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

}
