package Animals;

public class Dog extends Animal {
    private final TypeOfAnimals TYPE=TypeOfAnimals.DOG;

    public Dog(){
        super.setName(Input.inputStringbyconsole());
        super.setYear(Input.inputNumcerbyconcole());
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

