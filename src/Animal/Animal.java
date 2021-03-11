package Animal;
import Food.Food;


public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name=name;
    }

    public abstract void eat(Food food, Animal animal) throws WrongFoodException;

    public String getName(){
        return name;
    }
    public abstract String getName1();
    public abstract String getName2();
    public abstract int getSquare();

    @Override
    public boolean equals(Object object) {
        Animal animal = (Animal) object;
        if (object == null) {
            return false;
        }
        if (animal.getName() == this.getName()) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        final int tmp = 30;
        int sum = 1;
        sum = tmp + sum + getName().hashCode();
        return sum;
    }


}


