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
import Animal.Voice;
import java.util.Random;
import Animal.Run;

public class Zoo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Dog dog = new Dog();
        Sheep sheep = new Sheep();
        Tiger tiger = new Tiger();
        Beef beef = new Beef();
        ChikenMeat chikenMeet = new ChikenMeat();
        Pork pork = new Pork();
        Raigas raigas = new Raigas();
        Lupin lupin = new Lupin();
        Clover clover = new Clover();
        Worker worker = new Worker();
        Food[]foods=new Food[]{beef,pork,raigas,lupin,clover};
        Animal[]animals=new Animal[]{cow,duck,dog,sheep,tiger};
        Random random=new Random();
        for (int i = 0; i <animals.length; i++) {
            int s=random.nextInt(foods.length);
            System.out.println(i+1+"."+animals[i].getName());
            worker.getVoice((Voice)animals[i]);
            System.out.println("Даем "+animals[i].getName1()+":"+foods[s].getName());
            System.out.println("Стоимостью: "+foods[s].price());
            System.out.println(worker.feed(animals[i],foods[s])+animals[i].getName2()+"!");
        }

        System.out.println();
        Run[]runs=new Run[]{cow,dog,duck,sheep,tiger};
        for (int i = 0; i < runs.length; i++) {
            System.out.print(i+1+".");
            runs[i].Run();
        }
        System.out.println();
        System.out.print("1.");
        duck.fly();

        System.out.println();
        Swim[] pool = new Swim[]{duck, fish,};
        for (int i = 0; i < pool.length; i++) {
            System.out.print(i+1+".");
            pool[i].swim();
        }


    }
}
