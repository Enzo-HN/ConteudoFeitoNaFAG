package Atividade5;
import java.util.ArrayList;
import java.util.List;

public class Guilda {
    List<Personagem> personagens = new ArrayList<>();

    public void adicionarMembro(Personagem personagem){
        personagens.add(personagem);
    }
    public void atacarComTodos(){
        for(Personagem personagem : personagens){
            personagem.atacar();
        }

    }
    public void listarMembros()
    {
        for (Personagem personagem : personagens)
        {
            System.out.println(personagem);

        }
    }


}
