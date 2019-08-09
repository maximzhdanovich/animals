package Animals;

public class Frog extends Animal{
    private final TypeOfAnimals TYPE=TypeOfAnimals.FROG;

    public Frog(int year,String name){
        setName(name);
        setYear(year);
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
