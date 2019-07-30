package Animals;

public class Frog extends Animal{
    private final TypeOfAnimals TYPE=TypeOfAnimals.FROG;

    public Frog(){
        super.setName(Input.inputStringbyconsole());
        super.setYear(Input.inputNumcerbyconcole());
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
