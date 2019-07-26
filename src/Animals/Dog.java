package Animals;

public class Dog extends Animal {

    public Dog(TypeOfAnimals type) {
        super(type);
    }

    public void makesound() {
        System.out.println("Собака гавкает");
    }
}

