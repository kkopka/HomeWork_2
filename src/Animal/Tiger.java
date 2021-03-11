package Animal;

public class Tiger extends Carnivorous implements Run,Voice {
    private int length, width;

    public Tiger(String name) {
        super(name);
        length=5;
        width=5;
    }

    @Override
    public String getName() {
        return "Тигр";
    }
    @Override
    public String getName1() {
        return "тигру";
    }

    @Override
    public String getName2() {
        return "тигра";
    }

    @Override
    public void run() {
        System.out.println("Идет не спеша");
    }

    @Override
    public void walkin() {
        System.out.println("Бегает подпрыгивая");
    }

    @Override
    public String talk() {
       return  "Говорит:"+ "\"" + "Аррр" + "\"";
    }

    @Override
    public String shout() {
       return  "Кричит:"+ "\"" + "в на антилопу " + "\"";
    }
    @Override
    public int getSquare() {
       return width*length;
    }
}
