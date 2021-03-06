package Animal;



public class Duck extends Herbivor implements Fly,Swim,Voice,Run{

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Плавает по поверхности");
    }


    @Override
    public String voice() {
        return "Говорит:"+ "\"" + "Кряя" + "\"";
    }

    @Override
    public void Run() {
        System.out.println("Ходит медленно");
    }


    @Override
    public String getName() {
        return "Утка";
    }
    @Override
    public String getName1() {
        return "утке";
    }

    @Override
    public String getName2() {
        return "утки";
    }
}
