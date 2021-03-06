package Animal;

public class Cow extends Herbivor implements Run,Voice {

    @Override
    public void Run() {
        System.out.println("Корова ходит");

    }

    @Override
    public String voice() {

        return "Говорит:"+ "\"" + "Муууу" + "\"";
    }


    @Override
    public String getName() {

        return "Корова";
    }

    @Override
    public String getName1() {
        return "корове";
    }

    @Override
    public String getName2() {
        return "коровы";
    }
}
