package Animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Noah {
    List<Animal> squard = new ArrayList<>();

    public List<Animal> addtoSquard(List<Animal> animals) {
        animals=sortbyage(animals);
        for (int i=0;i<animals.size();i++) {
            TypeOfAnimals type=animals.get(i).gettype();
            if (type.numberof<2) {
                squard.add(animals.get(i));
                type.numberof++;
            }
        }
        return this.squard;

    }

    public List<Animal> sortbyage(List<Animal> animals) {
        Collections.sort(animals, (o1, o2) -> {
            if (o1.getYear()>o2.getYear())
                return 1;
            else if (o1.getYear()<o2.getYear())
                return -1;
            else return 0;
        });
    return animals;
    }

}