package Prova;

import Prova.objetos.Gerenciador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador g = new Gerenciador();
        int opcao = -1;
        Scanner s = new Scanner(System.in);
        while(opcao != 5){
            System.out.println("Sistema de Gerenciamento de folha de pagamento");
            System.out.println("1 - Cadastrar funcionarios.");
            System.out.println("2 - Listar funcionarios.");
            System.out.println("3 - Calcular salarios.");
            System.out.println("4 - Calcular folha de pagamento.");
            System.out.println("5 - Fechar Sistema.");
            opcao = s.nextInt();
            s.nextLine();
            switch (opcao) {
                case 1: g.cadastrarFuncionarios(); break;
                case 2: g.listarFuncionarios(); break;
                case 3: g.calcularSalarios(); break;
                case 4: g.calcularTotalPagamento(); break;
                case 5:
                    System.out.println("Encerrando sistema.");
                    break;
            }
        }
        s.close();
    }
}
