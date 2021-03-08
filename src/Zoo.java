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
        Food[] foods = new Food[]{beef, pork, raigas, lupin, clover, chikenMeet};
        Animal[] animals = new Animal[]{duck, fish, dog, sheep, tiger, cow};
        Animal[] voices = new Animal[]{cow, duck, dog, sheep, tiger};
        Swim[] swim = new Swim[]{duck, fish};
        Run[] run = new Run[]{cow, duck, dog, sheep, tiger};
        Random random = new Random();
        System.out.println("I.Кормим наших животных");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(i + 1 + "." + animals[i].getName());
            for (int j=0;j<foods.length;j++) {
                System.out.println("Даем " + animals[i].getName1() + ":" + foods[j].getName());
                System.out.println("Стоимостью: " + foods[j].price());
                System.out.println(worker.feed(animals[i], foods[j]) + animals[i].getName2() + "!");
            }
        }
        System.out.println("II.Слушаем как они говорят");
        for (int i = 0; i < voices.length; i++) {
            System.out.println(i + 1 + "." + voices[i].getName());
            worker.getVoice((Voice) voices[i]);
        }
        System.out.println("III.Смотрим как они плавают");
        for (int i = 0; i < swim.length; i++) {
            System.out.println(i + 1 + "." + animals[i].getName()+":");
            swim[i].swim();
            swim[i].swimVsFlow();
        }
        System.out.println("IV.Проверим на что они способны в передвижении");
        for (int i = 0; i <run.length ; i++) {
            System.out.println(i + 1 + "." + voices[i].getName()+":");
            run[i].run();
            run[i].walkin();
        }

        Aviary<Animal>aviary=new Aviary<Animal>();
        aviary.addInAviaryForHerbivor(sheep);
        aviary.getFromAviaryForHerbivor(sheep.getNickname())

    }
}
