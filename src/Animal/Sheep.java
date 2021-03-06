package Animal;

public class Sheep extends Herbivor implements Voice,Run {

    @Override
    public void Run() {
        System.out.println("Овца бежит");
    }

    @Override
    public String voice() {
        return "мееее";
    }
}
