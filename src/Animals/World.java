package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        while (true) {
            System.out.println("enter the type of animal (cat, dog or frog)or enter 1 to end");
            Scanner in = new Scanner(System.in);
            String type = in.nextLine().toUpperCase();
            if (!type.equals("1"))
                animalList.add(new God().create(TypeOfAnimals.valueOf(type)));
            else break;
        }
    }
}


