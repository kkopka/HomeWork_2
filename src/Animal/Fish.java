package Animal;

public class Fish extends Carnivorous implements Swim {
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
    public int mySquare() {
        return Enum.first.getSquare();
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
