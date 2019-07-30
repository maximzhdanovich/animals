package Animals;

public class Cat extends Animal{
    private final TypeOfAnimals TYPE=TypeOfAnimals.CAT;

    public Cat(){
        super.setName(Input.inputStringbyconsole());
        super.setYear(Input.inputNumcerbyconcole());
    }
    @Override
    public String makesound(){
        return "мяу-мяу";
    }

    @Override
    public TypeOfAnimals gettype() {
        return TYPE;
    }
}
