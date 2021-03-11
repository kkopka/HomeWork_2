package Animal;

import Food.Meat;
import Food.Food;
import Food.Grass;


public abstract class Herbivor extends Animal {
    public Herbivor(String name) {
        super(name);
    }

    @Override
    public void eat(Food food,Animal animal) throws WrongFoodException {

        if (food instanceof Meat) {
            throw new WrongFoodException("Не съедобная еда для "+animal.getName2());
        } else if (food instanceof Grass) {
            System.out.println("Съедобно для "+animal.getName2());
        }

    }

}


