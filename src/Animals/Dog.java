package Animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    static List<Dog> dogs=new ArrayList<>();

    public Dog(){
        super.setParametеrs();
    }

    public static void sound(){
        System.out.println("Собака гавкает");
    }

    public static void add(){
        dogs.add(new Dog());
        sound();
    }

    @Override
    public String toString() {
        return "Собака "+super.getName()+" возраст "+super.getYear();
    }
}

