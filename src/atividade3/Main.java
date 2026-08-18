package atividade3;
import java.util.ArrayList;
import java.util.Scanner;
import atividade3.objetos.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        System.out.println("=== Calculadora ===");
        String opcao;
        int n = -1;
        do {
            exibirMenu();
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextLine();
            try {
                n = Integer.parseInt(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Opçao invalido");
            }

            if(n > 0 && n < 9){
                executarOperacao(n);
            }

            else if (n == 0) {
                System.out.println("Encerrando o programa.");
            }

            else if (n == 9) {
                exibirHistorico();

            }

            else if (n == 10) {
                calculadora.getHistorico().limpar();
                System.out.println("Historico limpo com sucesso.\n");

            }


        } while (n != 0 );

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Porcentagem (a% de b)");
        System.out.println("6 - Potencia (a elevado a b)");
        System.out.println("7 - Raiz quadrada (somente do primeiro valor) - Ver historico de operacoes");
        System.out.println("8 - Resto da divisao");
        System.out.println("9 - Ver historico de operacoes");
        System.out.println("10 - Limpar historico");
        System.out.println("0 - Sair");
        System.out.println("---------------------------------");
    }

    static void executarOperacao(int opcao) {
        double primeiroValor = lerValor("Digite o primeiro valor: ");
        double segundoValor = 0;

        if (opcao != 7) {
            segundoValor = lerValor("Digite o segundo valor: ");
            if(segundoValor == 0 && opcao == 4)
            {
                System.out.println("Números não podem ser divididos por zero");
                return;
            }
        }


        double resultado = calculadora.calcular(primeiroValor, segundoValor, opcao);
        System.out.printf("Resultado: %.2f%n%n", resultado);

    }

    static double lerValor(String mensagem) {
        while (true) {
            System.out.print(mensagem + "(ou 'r' para reutilizar o ultimo resultado): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("r")) {
                if (calculadora.getHistorico().estaVazio()) {
                    System.out.println("Ainda nao ha resultado anterior para reutilizar.");
                    continue;
                }
                double ultimo = calculadora.getHistorico().obterUltimoResultado();
                System.out.printf("Reutilizando ultimo resultado: %.2f%n", ultimo);
                return ultimo;
            }

            try {
                return Double.parseDouble(entrada.replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero (ex: 10 ou 10.5).");
            }
        }
    }


    static void exibirHistorico() {
        Historico historico = calculadora.getHistorico();
        if (historico.estaVazio()) {
            System.out.println("Nenhuma operacao realizada ainda.\n");
            return;
        }
        System.out.println("=== Historico de operacoes ===");
        ArrayList<RegistroOperacao> registros = historico.listar();
        for (int i = 0; i < registros.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, registros.get(i));
        }
        System.out.println();
    }
}
