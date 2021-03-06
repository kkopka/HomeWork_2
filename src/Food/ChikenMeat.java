package Food;

public class ChikenMeat extends Meat {

    @Override
    public int price() {
        return 1;
    }

    @Override
    public String getName() {
        return "\"Мясо курицы\"";
    }
}
