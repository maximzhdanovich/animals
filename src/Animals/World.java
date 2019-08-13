package Animals;

import java.util.ArrayList;
import java.util.List;

public class World {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        God god = new God(new StringSupplierClass());
        Noah noah = new Noah();
        TypeSupplier type = new TypeSupplierClass();
        for (int i = 0; i < 100; i++) {
            animalList.add(god.create(type.getRandomValue()));
        }
        System.out.println(noah.addtoSquard(animalList, 2));
    }

}


