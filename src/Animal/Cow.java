package Animal;


public class Cow extends Herbivor implements Run, Voice {

    private int length, width;
    public Cow(String name) {
        super(name);
        length = 9;
        width = 9;
    }
    @Override
    public String getName1() {
        return "корове";
    }

    @Override
    public String getName2() {
        return "коровы";
    }


    @Override
    public int getSquare() {
        return length * width;
    }

    @Override
    public void run() {
        System.out.println("Бежит к водоему");
    }

    @Override
    public void walkin() {
        System.out.println("Ходит вальяжно");
    }

    @Override
    public String talk() {
        return "Говорит:" + "\"" + "Муууу" + "\"";
    }

    @Override
    public String shout() {
        return "Кричит на:" + "\"" + "Мух" + "\"";
    }
}
