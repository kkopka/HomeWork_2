package Animal;



public class Duck extends Herbivor implements Fly,Swim,Voice,Run{

    @Override
    public String getNickname() {
        return "Васян";
    }

    @Override
    public void flyLow() {
        System.out.println("Летит низко");
    }

    @Override
    public void flyGihjt() {
        System.out.println("Летит высоко");
    }

    @Override
    public void run() {
        System.out.println("Бежит");
    }

    @Override
    public void walkin() {
        System.out.println("Ходит медленно");
    }

    @Override
    public String talk() {
        return "Говорит:"+ "\"" + "Кряя" + "\"";
    }

    @Override
    public String shout() {
        return "Крякает:"+ "\"" + "От недовольства" + "\"";
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


    @Override
    public void swim() {
        System.out.println("Плывет по течению");
    }

    @Override
    public void swimVsFlow() {
        System.out.println("Плывет против течения");
    }
    @Override
    public int mySquare() {
        return Enum.first.getSquare();
    }
}
