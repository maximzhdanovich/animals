package Animals;

import java.util.*;

class Noah {
    List<Animal> squard = new ArrayList<>();

    public List<Animal> addtoSquard(List<Animal> animals) {
        TypeOfAnimals typename = null;
        int numberof = 0;
        animals = sortbyage(animals);
        for (int i = 0; i < animals.size(); i++) {
            if (typename != animals.get(i).gettype()) {
                typename = animals.get(i).gettype();
                squard.add(animals.get(i));
                numberof = 1;
            } else {
                if (numberof < 2) {
                    squard.add(animals.get(i));
                    numberof++;
                }
            }
        }
        return this.squard;
    }

    public List<Animal> sortbyage(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::gettype).thenComparing(Animal::getYear));
        return animals;
    }
}