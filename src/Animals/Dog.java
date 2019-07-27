package Animals;

public class Dog extends Animal {
    private final TypeOfAnimals TYPE=TypeOfAnimals.DOG;
    public Dog(){
        super();
    }
    @Override
    public String makesound() {
        return "гав гав";
    }

    @Override
    public TypeOfAnimals gettype() {
        return TYPE;
    }
}

