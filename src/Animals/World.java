package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        God god = new God(new RandomStringSupplier());
        Noah noah = new Noah();
        for (int i = 0; i < 100; i++) {
            animalList.add(god.create(getRandomtype()));
        }
        System.out.println(noah.addtoSquard(animalList, 2));
    }

    public static TypeOfAnimals getRandomtype(){
        Random random = new Random();
        return TypeOfAnimals.values()[random.nextInt(TypeOfAnimals.values().length)];

    }
}


