package Atividade11;
import java.util.ArrayList;
import java.util.List;
public class Academia {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Instrutor> instrutores = new ArrayList<>();
    private List<Plano> planos = new ArrayList<>();
    private List<Treino> treinos = new ArrayList<>();

    public boolean existeCpf(String cpf) {
        for (Aluno a : alunos) {
            if (a.getCpf().equalsIgnoreCase(cpf)) {
                return true;
            }
        }
        for (Instrutor i : instrutores) {
            if (i.getCpf().equalsIgnoreCase(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarAluno(Aluno a) {
        alunos.add(a);
    }

    public void cadastrarInstrutor(Instrutor i) {
        instrutores.add(i);
    }

    public void cadastrarPlano(Plano p) {
        planos.add(p);
    }

    public void cadastrarTreino(Treino t) {
        treinos.add(t);
        t.getAluno().adicionarTreinos(t);
    }

    public void listarHistoricoAluno(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            System.out.println(aluno.consultarHistorico());
        } else {
            System.out.println("Aluno nao encontrado.");
        }
    }

    public boolean verificarAcessoCatraca(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno == null) {
            return false;
        }
        return aluno.estaEmDia();
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                return a;
            }
        }
        return null;
    }

    public Instrutor buscarInstrutorPorNome(String nome) {
        for (Instrutor i : instrutores) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }
}