package Atividade8;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("filosofia", 1);
        curso.matricularAlunos("joe", "qeqwe12", curso);
        curso.matricularAlunos("jo2", "qeqwe123", curso);
        curso.matricularAlunos("jo3", "qeqwe124", curso);
        curso.matricularAlunos("sofia", "1231r", null);
        curso.listarAlunos();
    }
}
