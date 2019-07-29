package Animals;

import java.util.Scanner;

public abstract class Animal {
    public Animal(){
        Scanner in =new Scanner(System.in);
        setName(in.nextLine());
        setYear(in.nextInt());
    }
    private String name;
    private int year;
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public abstract String makesound();

    public abstract TypeOfAnimals gettype();

}

