package Animals;

import java.util.Random;

public class God {
    private StringSupplier animalname;
    God(StringSupplier name){
        animalname=name;
    }

    public Animal create(TypeOfAnimals typeOfAnimals) {
        Random random = new Random();
        switch (typeOfAnimals) {
            case CAT:
                return new Cat(random.nextInt(100) + 1, animalname.getString());
            case DOG:
                return new Dog(random.nextInt(100) + 1, animalname.getString());
            case FROG:
                return new Frog(random.nextInt(100) + 1, animalname.getString());
            default:
                throw new IllegalArgumentException();
        }
    }


}


