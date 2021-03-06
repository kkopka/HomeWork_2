package Animal;

public class Fish extends Carnivorous implements Swim {
    @Override
    public void swim() {
        System.out.println("Плавает под водой");
    }


    @Override
    public String getName() {
        return "Рыба";
    }
    @Override
    public String getName1() {
        return "рыбе";
    }

    @Override
    public String getName2() {
        return "рыбы";
    }
}
