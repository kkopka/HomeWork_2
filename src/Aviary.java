import Animal.Animal;
import Enums.Aviarytype;
import java.util.HashMap;
import Animal.Herbivor;
import Animal.Carnivorous;


public class Aviary<T extends Animal> {
    private Aviarytype aviarySquare;
    private int squareAllAnimalInAviary = 0;

    public Aviary(Aviarytype aviarySquare) {
        this.aviarySquare = aviarySquare;
    }

    private HashMap<String, T> aviary = new HashMap<>();

    private Boolean chek = null;

    public void addInAviary(T animal) {


        if (aviarySquare.getSquare() > squareAllAnimalInAviary + animal.getSquare()) {
            if (aviary.isEmpty() && chek == null) {
                chek = animal instanceof Herbivor;
                aviary.put(animal.getName(), animal);
            }
            if (!aviary.isEmpty()&&chek!=null) {
                if (chek) {
                    if (animal instanceof Herbivor) {
                        aviary.put(animal.getName(), animal);
                        squareAllAnimalInAviary += animal.getSquare();
                    }
                    else if (animal instanceof Carnivorous){
                        System.out.println("Это вольер для травоядных!");
                    }
                }
                if (!chek) {
                    if (animal instanceof Carnivorous){
                        aviary.put(animal.getName(),animal);
                        squareAllAnimalInAviary+=animal.getSquare();
                    }
                    else if (animal instanceof Herbivor){
                        System.out.println("Это вольер для хищников!");
                    }
                }

            }

        }
        else System.out.println("В вальере больше нет места, доступано: " + remainder() + " кв.м");
    }


    public void deletFromAviary(T animal) {
        aviary.remove(animal.getName(), animal);
        squareAllAnimalInAviary -= animal.getSquare();
    }

    public Animal getFromAviary(String name) {
        return aviary.get(name);
    }

    public int remainder() {
        return aviarySquare.getSquare() - squareAllAnimalInAviary;
    }

    public void quantityAnimalInAviary() {
        System.out.println("Количество животных в вольере: " + aviary.size());
    }


}
