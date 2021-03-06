package Animal;

import Food.Food;

public class Dog extends Carnivorous implements Voice,Run {

    @Override
    public void Run() {

        System.out.println("Лев бежит");
    }

    @Override
    public String voice() {
        return "Гав";
    }

}
