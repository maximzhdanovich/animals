package Animals;

import java.util.Scanner;

public class Animal {
    private String name;
    private int year;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setParametеrs() {
        System.out.println("Введите имя животного");
        Scanner in = new Scanner(System.in);
        this.name = in.nextLine();
        System.out.println("Введите возраст животного");
        this.year=in.nextInt();
    }

    public static void sound(){
        System.out.println("Животное что-то произности");
    }

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
}

