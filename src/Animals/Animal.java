package Animals;

import java.util.Scanner;

public class Animal {
    private String name;
    private int year;
    private TypeOfAnimals type;

    public Animal(TypeOfAnimals type) {
        this.type = type;
        Scanner in =new Scanner(System.in);
        System.out.println("input name");
        name=in.nextLine();
        System.out.println("input year");
        year=in.nextInt();
    }


    public int getYear() {
        return year;
    }

    public TypeOfAnimals getType() {
        return type;
    }

    @Override
    public String toString() {
        return type +
                "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void makesound(){
        System.out.println("Животное что-то произности");
    }

}

