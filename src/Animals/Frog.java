package Animals;

import java.util.ArrayList;
import java.util.List;

public class Frog extends Animal {
    static List<Frog> frogs = new ArrayList<>();

    public Frog() {
        super.setParametеrs();
    }

    public static void add() {
        frogs.add(new Frog());
        sound();
    }

    public static void sound() {
        System.out.println("Ляггушка квакает");
    }

    @Override
    public String toString() {
        return "Лягушка "+super.getName()+" возраст "+super.getYear();
    }
}
