package Animals;

public class Cat extends Animal{
    private final TypeOfAnimals TYPE=TypeOfAnimals.CAT;

    public Cat(int year,String name){
        setName(name);
        setYear(year);
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
