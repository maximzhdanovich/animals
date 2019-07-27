package Animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Noah {
    List<Animal> squard = new ArrayList<>();
    private int numberofcats = 0;
    private int numberofdogs = 0;
    private int numberoffrogs = 0;

    public List<Animal> addtoSquard(List<Animal> animals) {

        animals=sortbyage(animals);
        for (int i=0;i<animals.size();i++) {
            TypeOfAnimals type=animals.get(i).gettype();
            switch (type) {
                case CAT:
                    if (numberofcats < 2) {
                        squard.add(animals.get(i));
                        numberofcats++;
                    }
                    break;
                case DOG:
                    if (numberofdogs < 2) {
                        squard.add(animals.get(i));
                        numberofdogs++;
                    }
                    break;
                case FROG:
                    if (numberoffrogs < 2) {
                        squard.add(animals.get(i));
                        numberoffrogs++;
                    }
                    break;
                default:
                    break;
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