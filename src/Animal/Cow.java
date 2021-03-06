package Animal;

public class Cow extends Herbivor implements Run,Voice {
    @Override
    public void Run() {
        System.out.println("Корова бежи");
    }

    @Override
    public String voice() {
        return "Муууу";
    }
}
