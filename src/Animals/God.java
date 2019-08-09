package Animals;

import java.util.Random;

public class God {
    public Animal create(TypeOfAnimals typeOfAnimals) {
        Random random=new Random();
        switch (typeOfAnimals) {
            case CAT:
                return new Cat(random.nextInt(100)+1,randomString());
            case DOG:
                return new Dog(random.nextInt(100)+1,randomString());
            case FROG:
                return new Frog(random.nextInt(100)+1,randomString());
            default:
                throw new IllegalArgumentException();
        }
    }

    private String randomString(){
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


