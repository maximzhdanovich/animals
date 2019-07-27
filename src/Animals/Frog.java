package Animals;

public class Frog extends Animal{
    private final TypeOfAnimals TYPE=TypeOfAnimals.FROG;
    public Frog(){
        super();
    }
    @Override
    public String makesound() {
        return  "ква ква";
    }

    @Override
    public TypeOfAnimals gettype() {
        return TYPE;
    }
}
