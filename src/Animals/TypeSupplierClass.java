package Animals;

import java.util.Random;

public class TypeSupplierClass implements TypeSupplier {
    @Override
    public TypeOfAnimals getRandomValue() {
        Random random = new Random();
        return TypeOfAnimals.values()[random.nextInt(TypeOfAnimals.values().length)];
    }
}
