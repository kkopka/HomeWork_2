package Animal;

public class Dog extends Carnivorous implements Voice,Run {
    @Override
    public String getNickname() {
        return "Барсик";
    }

    @Override
    public String getName() {
        return "Собака";
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
    public int mySquare() {
        return Enum.second.getSquare();
    }
}
