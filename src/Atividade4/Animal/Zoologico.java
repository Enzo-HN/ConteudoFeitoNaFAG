package Atividade4.Animal;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }
    public void alimentarTodos(){
        for(Animal animal: animais)
        {
            animal.comer();
        }
    }
}
