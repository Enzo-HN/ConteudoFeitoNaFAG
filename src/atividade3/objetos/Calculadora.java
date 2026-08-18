package atividade3.objetos;

public class Calculadora {

    private final Historico historico = new Historico();
    public double calcular(double primeiroValor, double segundoValor, int opcao) {
        double resultado = 0;
        String operacao = "nenhum";
        boolean usaUmaOperacao = false;
        switch (opcao) {
            case 1 -> {
                resultado = somar(primeiroValor, segundoValor);
                operacao = "+";
            }
            case 2 -> {
                resultado = subtrair(primeiroValor, segundoValor);
                operacao = "-";
            }
            case 3 -> {
                resultado = multiplicar(primeiroValor, segundoValor);
                operacao = "*";
            }
            case 4 -> {
                resultado = dividir(primeiroValor, segundoValor);
                operacao = "/";
            }
            case 5 -> {
                resultado = porcentagem(primeiroValor, segundoValor);
                operacao = "%";
            }
            case 6 -> {
                resultado = potencia(primeiroValor, segundoValor);
                operacao = "^";
            }
            case 7 -> {
                resultado = raizQuadrada(primeiroValor);
                operacao = "SQRT";
                usaUmaOperacao = true;
            }
            case 8 -> {
                resultado = restoDivisao(primeiroValor, segundoValor);
                operacao = "MOD";
            }

        }

        historico.adicionar(new RegistroOperacao(primeiroValor, segundoValor, operacao, usaUmaOperacao, resultado));
        return resultado;
    }

    private double somar(double a, double b) {
        return a + b;
    }

    private double subtrair(double a, double b) {
        return a - b;
    }

    private double multiplicar(double a, double b) {
        return a * b;
    }

    private double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Nao e possivel dividir por zero.");
        }

        return a / b;

    }

    private double porcentagem(double a, double b) {
        return (a * b) / 100.0;
    }

    private double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    private double raizQuadrada(double a) {
        if (a < 0) {
            System.out.println("Nao e possivel calcular raiz quadrada de numero negativo.");
        }
        return Math.sqrt(a);
    }

    private double restoDivisao(double a, double b) {
        if (b == 0) {
            System.out.println("Nao e possivel calcular resto de divisao por zero.");
        }
        return a % b;
    }

    public Historico getHistorico() {
        return historico;
    }
}
