package Atividade10.Bancario;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
            return;
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo disponível: R$ " + this.saldo);
        }

        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}

