package Animals;

public class Cat extends Animal{
    public Cat(TypeOfAnimals type) {
        super(type);
    }
    public void makesound(){
        System.out.println("Кошка мяукает");
    }
}
