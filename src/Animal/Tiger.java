package Animal;

public class Tiger extends Carnivorous implements Run,Voice {

    @Override
    public void Run() {
        System.out.println("Тигр бежит");
    }

    @Override
    public String voice() {
        return "Аррр";
    }

}
