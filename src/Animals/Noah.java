package Animals;

import java.util.*;

class Noah {
    Map<TypeOfAnimals, List<Animal>> squard= new HashMap();

    public Map<TypeOfAnimals, List<Animal>> addtoSquard(List<Animal> animals, int numberOfAnimal) {
        Map<TypeOfAnimals, ArrayList<Animal>> sortedGroup = groupbytype(sortbyage(animals));
        for (TypeOfAnimals type : sortedGroup.keySet())
                squard.put(type,sortedGroup.get(type).subList(0,numberOfAnimal));
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