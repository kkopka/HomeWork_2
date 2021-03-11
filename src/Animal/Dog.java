package Animal;

public class Dog extends Carnivorous implements Voice,Run {
    private int length, width;
    public Dog(String name) {
        super(name);
        length=4;
        width=4;
    }

    @Override
    public String getName1() {
        return "собаке";
    }

    @Override
    public String getName2() {
        return "собаки";
    }

    @Override
    public void run() {
        System.out.println("Бегает");
    }

    @Override
    public void walkin() {
        System.out.println("Ходит");
    }

    @Override
    public String talk() {
        return "Говорит:"+ "\"" + "Гав" + "\"";
    }

    @Override
    public String shout() {
        return "Кричит:"+ "\"" + "на кошку" + "\"";
    }

    @Override
    public int getSquare() {
        return length*width;
    }
}
