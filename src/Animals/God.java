package Animals;

public class God {
   public Animal create(TypeOfAnimals typeOfAnimals){
           switch (typeOfAnimals){
               case CAT:
                   return new Cat();
               case DOG:
                   return new Dog();
               case FROG:
                   return new Frog();
                   default: throw new IllegalArgumentException();
           }

       }
   }


