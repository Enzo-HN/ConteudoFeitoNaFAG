package Atividade5;

public class Main {
    static Guilda guilda = new Guilda();

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Arthur", 120, 10);
        Mago mago = new Mago("Merlin", 60, 10);
        Arqueiro arqueiro = new Arqueiro("Legolas", 80, 10);
        Sacerdote sacerdote = new Sacerdote("Gabriel", 100, 10);
        guilda.adicionarMembro(guerreiro);
        guilda.adicionarMembro(mago);
        guilda.adicionarMembro(arqueiro);
        guilda.adicionarMembro(sacerdote);
        guilda.listarMembros();
        guilda.atacarComTodos();
        sacerdote.curar();

    }
}
