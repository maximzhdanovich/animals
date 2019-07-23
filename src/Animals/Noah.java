package Animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Noah implements Comparator<Animal> {
    static List <Animal> squad=new ArrayList<>();
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getYear()>o2.getYear())
            return 1;
        else if(o1.getYear()<o2.getYear())
            return -1;
        else return 0;
    }

    public static void sort(List<? extends Animal> animal){
        Collections.sort(animal, new Noah());
        System.out.println(animal.toString());
    }

    public static void addtosquad (List<? extends Animal> animals){
        squad.add(animals.get(0));
        squad.add(animals.get(1));
    }
}
