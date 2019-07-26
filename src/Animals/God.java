package Animals;

public class God {
   public Animal create(TypeOfAnimals typeOfAnimals){
   Animal animal=null;
       switch (typeOfAnimals){
           case CAT:{
               animal =new Cat(typeOfAnimals);
               break;}
           case DOG: {
               animal = new Dog(typeOfAnimals);
               break;
           }
           case FROG:{
               animal =new Frog(typeOfAnimals);
               break;
           }
           default: break;

   }
   animal.makesound();
   return animal;
}
}

