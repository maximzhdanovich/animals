package Animals;

public class Frog extends Animal{

    public Frog(TypeOfAnimals type) {
        super(type);
    }

    public void makesound() {
        System.out.println("Лягушка квакает");
    }
}
