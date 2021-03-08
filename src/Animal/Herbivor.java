package Animal;

import Food.Meat;
import Food.Food;
import Food.Grass;


public abstract class Herbivor extends Animal {
    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Meat) {
            throw new WrongFoodException("Не съедобная еда");
        } else if (food instanceof Grass) {
            System.out.println("Съедобно");
        }

    }

}


