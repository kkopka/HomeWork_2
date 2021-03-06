package Animal;

import Food.Meat;
import Food.Food;
import Food.Grass;


public abstract class Herbivor extends Animal {
    @Override
    public String eat(Food food) {
        String s = null;
        if (food instanceof Meat) {
            s = "Не съедобно для ";

        } else if (food instanceof Grass) {
            s = "Съедобно для ";
        }
        return s;
    }

}


