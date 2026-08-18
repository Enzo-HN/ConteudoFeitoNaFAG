package Atividade1.Objetos;

public class Livro {
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponivel;
    private Aluno emprestador;

    public Livro(String titulo, String autor, String codigo) {
        setTitulo(titulo);
        setAutor(autor);
        setCodigo(codigo);
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Titulo do livro inserido está em branco");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor do livro inserido está em branco");
        }
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo do livro inserido está em branco");
        }
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Aluno getEmprestador() {
        return emprestador;
    }

    public void emprestar(Aluno aluno) {
        if (!this.disponivel) {
            System.out.println("Este livro já está emprestado");
            return;
        }
        this.disponivel = false;
        this.emprestador = aluno;
    }

    public void devolver() {
        this.emprestador.setQuantidadeEmprestada(-1);
        this.disponivel = true;
        this.emprestador = null;
    }

    public String imprimirInformacoes() {
        String i = "Livro " + this.codigo + ": " + this.titulo + " por autor " + autor + " está ";
        if (this.disponivel) {
            i += "Disponivel";
        } else {
            i += "Indisponivel";
        }
        return i;
    }
}