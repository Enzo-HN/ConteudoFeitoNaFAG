package Atividade10.CadastroDeProduto;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(String nome, double preco, int quantidade)
            throws NomeInvalidoException, PrecoInvalidoException, QuantidadeInvalidaException {

        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("O nome do produto não pode estar vazio.");
        }
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }
        if (quantidade < 0) {
            throw new QuantidadeInvalidaException("A quantidade não pode ser negativa.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}

