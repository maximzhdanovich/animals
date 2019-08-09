package Animals;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<100;i++){
            animalList.add(new God().create(TypeOfAnimals.values()[random.nextInt(TypeOfAnimals.values().length)]));
        }
        System.out.println(new Noah().addtoSquard(animalList,2));
    }
}


