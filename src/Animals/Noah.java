package Animals;

import java.util.*;

class Noah {
    Map<TypeOfAnimals,Animal[]> squard = new HashMap<>();

    public Map<TypeOfAnimals,Animal[]> addtoSquard(List<Animal> animals) {
        animals=sortbyage(animals);
        for (int i=0;i<animals.size();i++) {
            if(squard.containsKey(animals.get(i).gettype())){
                if(squard.get(TypeOfAnimals.CAT).length==1){
                    squard.put(animals.get(i).gettype(),new Animal[]{squard.get(animals.get(i).gettype())[0], animals.get(i)});
                }
            }
            else squard.put(animals.get(i).gettype(),new Animal[]{animals.get(i)});
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