package Animal;

public class Sheep extends Herbivor implements Voice,Run {

    @Override
    public void Run() {
        System.out.println("Овца передвигается");
    }

    @Override
    public String voice() {
        return "Говорит:"+ "\"" + "Меее" + "\"";
    }

    @Override
    public String getName() {
        return "Овца";
    }
    @Override
    public String getName1() {
        return "овце ";
    }

    @Override
    public String getName2() {
        return "овцы";
    }
}
