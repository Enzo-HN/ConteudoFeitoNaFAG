package Atividade6;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Claudio");
        Professor professor = new Professor("CLeber");
        professor.setOrientado(aluno);
        professor.exibirOrientado();
    }
}
