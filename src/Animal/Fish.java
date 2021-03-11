package Animal;

public class Fish extends Carnivorous implements Swim {
    private int length, width;
    public Fish(String name) {
        super(name);
        length=3;
        width=3;
    }

    @Override
    public void swim() {
        System.out.println("Плавает под водой, по течению");
    }

    @Override
    public void swimVsFlow() {
        System.out.println("Пытается пыть против течения");
    }

    @Override
    public int getSquare() {
        return width*length;
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
