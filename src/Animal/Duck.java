package Animal;

public class Duck extends Herbivor implements Fly,Swim,Voice,Run{

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public String voice() {
        return "Кря";
    }

    @Override
    public void Run() {
        System.out.println("Утка бежит");
    }
}
