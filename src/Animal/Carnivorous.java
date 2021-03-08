package Animal;

import Food.Food;
import Food.Grass;
import Food.Meat;


public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Не съедобая еда");
        }
        if (food instanceof Meat) {
            System.out.println("Съедобно");
        }

    }


}
