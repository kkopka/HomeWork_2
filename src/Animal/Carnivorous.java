package Animal;

import Food.Food;
import Food.Grass;
import Food.Meat;
import Food.Beef;
import Food.ChikenMeat;
import Food.Pork;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Хищники траву не едят!");
        }
        if (food instanceof Meat) {
            if (food instanceof ChikenMeat) {
                System.out.print("Съел куринное мясо, ");
            } else if (food instanceof Beef) {
                System.out.print("Съел говядину, ");
            } else if (food instanceof Pork) {
                System.out.print("Съел свиннину, ");
            }
            System.out.println("стоимость еды составила: "+food.price()+" от.ед");
        }
    }


}
