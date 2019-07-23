package Animals;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
    static List<Cat> cats=new ArrayList<>();

    public Cat(){
        super.setParametеrs();
    }

    public static void sound(){
        System.out.println("Кошка мяукает");
    }

    public static void add(){
        cats.add(new Cat());
        sound();
    }

    @Override
    public String toString() {
        return "Кот "+super.getName()+" возраст "+super.getYear();
    }
}
