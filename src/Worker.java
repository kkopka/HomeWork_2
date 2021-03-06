import Animal.Animal;
import Food.Food;
import Animal.Herbivor;
import Animal.Fish;
import Animal.Voice;
import java.io.IOException;

public class Worker  {

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
