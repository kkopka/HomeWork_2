package Food;

public class Pork extends Meat {


    @Override
    public int price() {
        return 2;
    }

    @Override
    public String getName() {
        return "\"Свинину\"";
    }
}
