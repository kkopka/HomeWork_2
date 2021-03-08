import Animal.Animal;
import Food.Food;
import Animal.Voice;
import Animal.WrongFoodException;


public class Worker  {

    public void feed(Animal animal,Food food){
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
    public void getVoice(Voice animal){
        System.out.println(animal.talk());
        System.out.println(animal.shout());
    }
}
