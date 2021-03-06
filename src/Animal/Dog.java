package Animal;

public class Dog extends Carnivorous implements Voice,Run {

    @Override
    public void Run() {

        System.out.println("Собака бегает");
    }

    @Override
    public String voice() {
        return "Говорит:"+ "\"" + "Гав" + "\"";
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
}
