package Animal;

import Food.Food;
import Food.Grass;
import Food.Meat;


public abstract class Carnivorous extends Animal {

    @Override
    public String eat(Food food) {
        String s=null;
        if (food instanceof Grass) {
            s="Не съедобно для ";
        }
        if (food instanceof Meat) {
            return s="Съедобно для ";
        }
        return s;
    }


}
