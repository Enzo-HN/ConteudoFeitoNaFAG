package Atividade4.Veiculos;

public abstract class Veiculo {
    private static String nome;
    private static int velocidadeMaxima;

    public Veiculo(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void exibirInformacoes()
    {
        System.out.println("Veículo: " + nome + ", Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
    public void exibirTipo()
    {
        System.out.println("Este é um veículo genérico.");
    }

}
