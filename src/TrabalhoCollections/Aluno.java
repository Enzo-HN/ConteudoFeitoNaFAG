package TrabalhoCollections;

public class Aluno implements Comparable<Aluno> {
    //vou usar o mesmo aluno para TUDO
       String nome;
       double nota;
       int idade;

       Aluno(String nome,double nota, int idade){
           this.nome=nome;
           this.nota=nota;
           this.idade=idade;
       }
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.idade, outro.idade);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota=" + nota + ", idade=" + idade + '}';
    }
}

