import Animal.Animal;
import Food.Food;
import Animal.Voice;


public class Worker  {

    public String feed(Animal animal,Food food){
      return  animal.eat(food);
    }
    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
