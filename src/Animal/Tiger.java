package Animal;

public class Tiger extends Carnivorous implements Run,Voice {

    @Override
    public void Run() {
        System.out.println("Тигр бежит");
    }

    @Override
    public String voice() {
        return "Говорит:"+ "\"" + "Аррр" + "\"";
    }

    @Override
    public String getName() {
        return "Тигр";
    }
    @Override
    public String getName1() {
        return "тигру ";
    }

    @Override
    public String getName2() {
        return "тигра";
    }
}
