import Animal.Animal;
import java.util.HashMap;



public class Aviary<T extends Animal> {

    private static int a;
    private static int b;


    public Aviary() {
        a = 5;
        b = 5;
    }

    public static int getSquareAviary() {
        return a*b;
    }

    public static boolean check(int squareAnimal,int squareAviary) {
        if (squareAnimal>squareAviary){
         return false;
        }
        else return true;
    }

    private HashMap<String, T> aviary = new HashMap<>();

    public void addInAviary(T animal) {
        if (check(animal.mySquare(), getSquareAviary())) {
            aviary.put(animal.getNickname(), animal);
        }
        else System.out.println(animal.getNickname()+ " в вальер не помещается");
    }
    public void DeletFromAviary(T animal) {
              aviary.remove(animal.getNickname(),animal);
        }



    public Animal getFromAviary(String nickName) {
      return aviary.get(nickName);
    }

}
