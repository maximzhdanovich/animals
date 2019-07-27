package Animals;

public class God {
   public Animal create(TypeOfAnimals typeOfAnimals){
   Animal animal=null;
       switch (typeOfAnimals){
           case CAT:{
               animal =new Cat();
               break;}
           case DOG: {
               animal = new Dog();
               break;
           }
           case FROG:{
               animal =new Frog();
               break;
           }
           default: break;

   }
   return animal;
}
}

