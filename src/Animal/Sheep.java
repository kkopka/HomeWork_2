package Animal;

import Enums.Enum;

public class Sheep extends Herbivor implements Voice,Run {

    @Override
    public String getNickname() {
        return "Боня";
    }
    @Override
    public String getName() {
        return "Овца";
    }
    @Override
    public String getName1() {
        return "овце";
    }

    @Override
    public String getName2() {
        return "овцы";
    }

    @Override
    public void run() {
        System.out.println("Бежит от волка");
    }

    @Override
    public void walkin() {
        System.out.println("Передвигается медленно");
    }

    @Override
    public String talk() {
        return "Говорит:"+ "\"" + "Меее" + "\"";
    }

    @Override
    public String shout() {
        return "Ругается:"+ "\"" + "На куриц" + "\"";
    }
    @Override
    public int mySquare() {
        return Enum.THIRD.getSquare();
    }
}
