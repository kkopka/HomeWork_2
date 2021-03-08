import Animal.Animal;
import Animal.Herbivor;

import java.util.HashMap;

import Animal.Carnivorous;

public class Aviary<T extends Animal> {

    private static int a;
    private static int c;
    private static int b;
    private static int d;

    public Aviary() {
        a = 5;
        b = 5;
        c = 5;
        d = 5;
    }

    public static int[] getSizeAviary() {
        return new int[]{a, b, c, d};
    }

    public static boolean check(int[] animal, int[] aviary) {
        boolean x = true;
        for (int i = 0; i < aviary.length; i++) {
            if (animal[i] > aviary[i]) {
                x = false;
                break;
            }
        }
        return x;
    }

    private HashMap<String, T> aviaryForHerbivor = new HashMap<>();
    private HashMap<String, T> aviaryForCarnivorous = new HashMap<>();

    public void addInAviaryForHerbivor(T animal) {
        if (check(animal.mySize(),getSizeAviary())){
            if (animal instanceof Herbivor) {
                aviaryForHerbivor.put(animal.getNickname(), animal);
            } else if (animal instanceof Carnivorous) {
                aviaryForCarnivorous.put(animal.getNickname(), animal);
            }
        }
        else System.out.println("Животное в вальер не помещается");
    }

    public void DeletFromAviaryForHerbivor(T animal) {
            if (animal instanceof Herbivor) {
                aviaryForHerbivor.remove(animal.getNickname(), animal);
            } else if (animal instanceof Carnivorous) {
                aviaryForCarnivorous.remove(animal.getNickname(), animal);
            }

    }

    public Animal getFromAviaryForHerbivor(String name) {
        Animal animal1 = null;
        if (animal instanceof Herbivor) {
            animal1 = aviaryForHerbivor.get(animal.getNickname());
        } else if (animal instanceof Carnivorous) {
            animal1 = aviaryForCarnivorous.get(animal.getNickname());
        }
        return animal1;
    }
}
