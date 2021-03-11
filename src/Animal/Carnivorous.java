package Animal;

import Food.Food;
import Food.Grass;
import Food.Meat;


public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food,Animal animal) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Не съедобая еда для "+animal.getName2());
        }
        if (food instanceof Meat) {
            System.out.println("Съедобно для"+animal.getName2());
        }

    }


}
