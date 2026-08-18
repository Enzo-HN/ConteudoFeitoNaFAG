package Atividade4;
import Atividade4.Animal.*;
import Atividade4.Veiculos.*;

public class Main {
    static Onibus onibus = new Onibus("Onibus escolar" , 120);
    static Carro carro = new Carro("carro", 200);
    static Gato gato = new Gato();
    static Cachorro cachorro = new Cachorro();
    static Quadrado quadrado = new Quadrado(5);
    static Circulo circulo = new Circulo(3);
    static Zoologico zoo = new Zoologico();
    public static void main(String[] args) {
        onibus.exibirInformacoes();
        carro.exibirTipo();
        cachorro.falar();
        gato.falar();
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        boolean eCao = cachorro instanceof Cachorro;
        boolean eBixo = cachorro instanceof Animal;
        System.out.println("é um cachorro? " + eCao + ", é animal? " + eBixo);
        zoo.adicionarAnimal(new Leao());
        zoo.adicionarAnimal(new Elefante());
        zoo.adicionarAnimal(new Macaco());
        zoo.alimentarTodos();

    }
}
