package Food;

public class Beef  extends  Meat{

    @Override
    public int price() {
        return 3;
    }

    @Override
    public String getName() {
        return "\"Говядину\"";
    }

}
