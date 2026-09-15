package Prova.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {
    public List<Pessoa> pessoas;
    public Gerenciador() {
        pessoas = new ArrayList<>();
    }

    public void cadastrarFuncionarios()
    {
        System.out.println("Qual tipo de funcionario você quer cadastrar?");
        System.out.println("1 - Professor");
        System.out.println("2 - Desenvolvedor");
        System.out.println("3 - Gerente");
        int opcao;
        Scanner s = new Scanner(System.in);
        opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1)
        {
            System.out.println("Insira o nome do Professor:");
            String nome = s.nextLine();
            System.out.println("Insira o salario por hora do Professor:");
            double recebidoPorHora = s.nextDouble();
            System.out.println("Insira a quantidade de horas trabalhadas pelo Professor:");
            int horas =  s.nextInt();
            s.nextLine();
            try {
                Professor p = new Professor(nome, recebidoPorHora, horas);
                pessoas.add(p);
                System.out.println("Cadastrado com sucesso");
            }
            catch (HorasNegativas e) {
                System.out.println(e);
            }
        }
        else if (opcao == 2)
        {
            System.out.println("Insira o nome do Desenvolvedor:");
            String nome = s.nextLine();
            System.out.println("Insira o salario base do Desenvolvedor:");
            double salarioBase = s.nextDouble();
            System.out.println("Insira a quantidade de Bonus que o Desenvolvedor ganha:");
            double bonus =  s.nextDouble();
            s.nextLine();
            try {
                Desenvolvedor d = new Desenvolvedor(nome, salarioBase, bonus);
                pessoas.add(d);
                System.out.println("Cadastrado com sucesso");
            }
            catch (SalarioNegativo e) {
                System.out.println(e);
            }
            catch (BonusNegativos e) {
                System.out.println(e);
            }
        }
        else if (opcao == 3)
        {
            System.out.println("Insira o nome do Gerente:");
            String nome = s.nextLine();
            System.out.println("Insira o salario base do Gerente:");
            double salarioBase = s.nextDouble();
            System.out.println("Insira o percentual (%) de bonus de salario do Gerente (De preferencia em numero inteiro):");
            double percentual =  s.nextDouble();
            s.nextLine();
            try {
                Gerente g = new Gerente(nome, salarioBase, percentual);
                pessoas.add(g);
                System.out.println("Cadastrado com sucesso");
            }
            catch (SalarioNegativo e) {
                System.out.println(e);
            }
            catch (BonusNegativos e) {
                System.out.println(e);
            }
        }


    }
    public void listarFuncionarios()
    {
        for (Pessoa p : pessoas)
        {
            System.out.println(p);
        }
    }
    public void calcularSalarios()
    {
        for (Pessoa p : pessoas)
        {
            System.out.println(p + " tem um salario de: R$ " + p.calcularSalario());
        }
    }
    public void calcularTotalPagamento()
    {
        double total = 0;
        for (Pessoa p : pessoas)
        {
            System.out.println(p.tipo + " " + p.nome + " tem um salario de: R$ " + p.calcularSalario());
            total += p.calcularSalario();
        }
        System.out.println("");
        System.out.println("Valor total da folha de pagamentos: R$" + total);
    }

}
