import Animal.Animal;
import Enums.Aviarytype;
import java.util.HashMap;



public class Aviary<T extends Animal> {
    private Aviarytype aviarySquare;
    private int squareAllAnimalInAviary = 0;
    public Aviary(Aviarytype aviarySquare) {
        this.aviarySquare = aviarySquare;
    }

    public HashMap<String, T> aviary = new HashMap<>();

    private String chek = null;

    public void addInAviary(T animal) {

        if (aviarySquare.getSquare() > squareAllAnimalInAviary + animal.getSquare()) {

            if (aviary.isEmpty()) {
                aviary.put(animal.getNickname(), animal);
                chek = aviary.get(animal.getNickname()).getClass().getSuperclass().getSimpleName();
            }
            if (!aviary.isEmpty()) {
                if (chek.equals(animal.getClass().getSuperclass().getSimpleName())) {
                    aviary.put(animal.getNickname(), animal);
                    squareAllAnimalInAviary += animal.getSquare();
                } else {
                    if (chek.equals("Herbivor")) {
                        System.out.println("Это вольер для травоядных");
                    } else System.out.println("Это вольер для хищников");
                }

            }

        } else System.out.println("В вальере больше нет места, доступано: "+remainder()+" кв.м");

    }

    public void deletFromAviary(T animal) {
        aviary.remove(animal.getNickname(), animal);
        squareAllAnimalInAviary -= animal.getSquare();
    }

    public Animal getFromAviary(String nickName) {
        return aviary.get(nickName);
    }

    public int remainder(){
        return aviarySquare.getSquare()-squareAllAnimalInAviary;
    }

    public void quantityAnimalInAviary(){
        System.out.println("Количество животных в вольере: "+aviary.size());
    }


}
