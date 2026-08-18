package atividade3.objetos;

public class RegistroOperacao {

    private final double primeiroValor;
    private final double segundoValor;
    private final String operacao;
    private final boolean usaUmaOperacao;
    private final double resultado;

    public RegistroOperacao(double primeiroValor, double segundoValor, String operacao, boolean usaUmaOperacao, double resultado) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
        this.operacao = operacao;
        this.usaUmaOperacao = usaUmaOperacao;
        this.resultado = resultado;
    }
    public double getResultado() {
        return resultado;
    }
    @Override
    public String toString() {
        if (usaUmaOperacao) {
            return String.format("%s(%.2f) = %.2f", operacao, primeiroValor, resultado);
        }
        return String.format("%.2f %s %.2f = %.2f", primeiroValor, operacao, segundoValor, resultado);
    }
}