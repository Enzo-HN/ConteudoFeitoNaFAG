package Atividade4.Veiculos;

public class Carro extends Veiculo {

    public Carro(String nome, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }

    @Override
    public void exibirTipo() {
        super.exibirTipo();
        System.out.println("Este é um carro específico.");
    }
}
