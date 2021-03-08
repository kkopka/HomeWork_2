package Animal;
import Food.Food;


public abstract class Animal {



    public abstract void eat(Food food) throws WrongFoodException;

    public abstract String getName();

    public abstract String getName1();

    public abstract String getName2();

    public abstract String getNickname();
    public abstract int mySquare();

    @Override
    public boolean equals(Object object) {
        Animal animal = (Animal) object;
        if (object == null) {
            return false;
        }
        if (animal.getNickname() == this.getNickname()) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        final int tmp = 30;
        int sum = 1;
        sum = tmp + sum + getNickname().hashCode();
        return sum;
    }


}


