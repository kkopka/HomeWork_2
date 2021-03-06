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
                System.out.print("Съел люпин, ");
            }
            else if (food instanceof Clover){
                System.out.print("Съел клевер, ");
            }
            else if (food instanceof Raigas){
                System.out.print("Съел травы, ");
            }
            System.out.println("стоимость еды составила: "+food.price()+" от.ед");
        }

    }
}
