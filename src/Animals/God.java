package Animals;

import java.util.Random;

public class God implements IStringSupplier {

    public Animal create(TypeOfAnimals typeOfAnimals) {
        Random random=new Random();
        switch (typeOfAnimals) {
            case CAT:
                return new Cat(random.nextInt(100)+1,getString());
            case DOG:
                return new Dog(random.nextInt(100)+1,getString());
            case FROG:
                return new Frog(random.nextInt(100)+1,getString());
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getString() {
        final String characters="ABCDEFGHJKLMNOPQRSTUVWXYZ";
        int length=new Random().nextInt(10)+1;
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        return new String(text);
    }
}


