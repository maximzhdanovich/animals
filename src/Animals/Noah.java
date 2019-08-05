package Animals;

import java.util.*;

class Noah {
    List<Animal> squard = new ArrayList<>();

    public List<Animal> addtoSquard(List<Animal> animals, int numberOfAnimal) {
        Map<TypeOfAnimals, ArrayList<Animal>> sortedGroup = groupbytype(sortbyage(animals));
        int index = 0;
        for (TypeOfAnimals type : sortedGroup.keySet()) {
            for (Animal animals1 : sortedGroup.get(type)) {
                squard.add(animals1);
                index++;
                if (index == numberOfAnimal)
                    break;
            }
            index = 0;
        }
        return squard;
    }

    public List<Animal> sortbyage(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::getYear));
        return animals;
    }

    private Map<TypeOfAnimals, ArrayList<Animal>> groupbytype(List<Animal> animals) {
        Map<TypeOfAnimals, ArrayList<Animal>> group = new TreeMap<>();
        for (Animal animal : animals) {
            group.putIfAbsent(animal.gettype(), new ArrayList<>());
            group.get(animal.gettype()).add(animal);
        }
        return group;
    }
}