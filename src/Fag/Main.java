package Fag;
import Fag.objetos.Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o nome do funcionario");
        String nome = scanner.nextLine();
        System.out.println("Coloque o salario do funcionario");
        double salario = scanner.nextDouble();
        
        Funcionarios funcionarios = new Funcionarios(nome,salario);
        System.out.println(funcionarios);
        funcionarios.aumentaSalario(599);
        System.out.println("O salario agora é de " + funcionarios.getSalario());
    }

}
