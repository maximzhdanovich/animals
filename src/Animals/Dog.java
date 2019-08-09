package Animals;

public class Dog extends Animal {
    private final TypeOfAnimals TYPE=TypeOfAnimals.DOG;

    public Dog(int year,String name){
        super.setName(name);
        super.setYear(year);
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

