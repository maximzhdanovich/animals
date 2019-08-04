package Animals;

import java.util.*;

class Noah {
    Map<TypeOfAnimals,ArrayList<Animal>> squard = new HashMap<>();

    public Map<TypeOfAnimals,ArrayList<Animal>> addtoSquard(List<Animal> animals) {
        animals = sortbyage(animals);
        for(Animal animal:animals){
          squard.putIfAbsent(animal.gettype(),new ArrayList<>());
          squard.get(animal.gettype()).add(animal);
        }
        return this.squard;
    }

    public List<Animal> sortbyage(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::getYear));
        return animals;
    }
}