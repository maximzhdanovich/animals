package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Random random = new Random();
        God god = new God();
        Noah noah = new Noah();
        int index;
        for (int i = 0; i < 100; i++) {
            index=random.nextInt(TypeOfAnimals.values().length);
            animalList.add(god.create(TypeOfAnimals.values()[index]));
        }
        System.out.println(noah.addtoSquard(animalList, 2));
    }
}


