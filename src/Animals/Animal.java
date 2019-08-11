package Animals;

public abstract class Animal {

    private String name;
    private int year;

    public Animal(int year,String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

