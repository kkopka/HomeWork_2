package Animal;

public class Fish extends Carnivorous implements Swim {
    private int length, width;
    public Fish() {
        length=3;
        width=3;
    }

    @Override
    public String getNickname() {
        return "Немо";
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
