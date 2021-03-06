import Animal.Animal;
import Animal.Fish;
import Animal.Cow;
import Animal.Dog;
import Animal.Duck;
import Animal.Sheep;
import Animal.Tiger;
import Food.Food;
import Food.Beef;
import Food.Lupin;
import Food.ChikenMeat;
import Food.Clover;
import Food.Raigas;
import Food.Pork;
import Animal.Swim;

import java.io.IOException;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args)  {
        Cow cow = new Cow();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Dog dog = new Dog();
        Sheep sheep = new Sheep();
        Tiger tiger = new Tiger();
        Food beef = new Beef();
        Food chikenMeet = new ChikenMeat();
        Food pork = new Pork();
        Food raigas = new Raigas();
        Food lupin = new Lupin();
        Food clover = new Clover();
        Worker worker = new Worker();
        worker.getVoice(dog);
        worker.feed(dog, chikenMeet);
        worker.feed(dog, clover);
        worker.getVoice(tiger);
        worker.feed(sheep, lupin);
        worker.feed(sheep, beef);
        Swim[] pool = new Swim[]{duck, fish};
        for (Swim swim : pool) {
            swim.swim();
        }

    }
}
