package Animal;
import Food.Meat;
import Food.Food;
import Food.Grass;
import Food.Lupin;
import Food.Raigas;
import Food.Clover;
public abstract class Herbivor extends Animal {
    @Override
   public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Травоядные не едят мясо!");
        }
        if (food instanceof Grass){
            if (food instanceof Lupin){
                System.out.println("Съел люпин");
            }
            else if (food instanceof Clover){
                System.out.println("Съел клевер");
            }
            else if (food instanceof Raigas){
                System.out.println("Съел травы");
            }
        }

    }
}
