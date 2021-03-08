package Animal;


public class Cow extends Herbivor implements Run,Voice {

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

    @Override
    public String getNickname() {
        return "Милка";
    }
    @Override
    public int[] mySize() {
        return Enum.fourth.getSize();
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
        return "Говорит:"+ "\"" + "Муууу" + "\"";
    }

    @Override
    public String shout() {
        return "Кричит на:"+ "\"" + "Мух" + "\"";
    }
}
