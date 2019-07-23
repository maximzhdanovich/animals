package Animals;
import java.util.*;

public class God {
    public static void main(String[] args) {
        int n;
        int k;
        boolean proverka = true;
        Scanner in = new Scanner(System.in);
        while(proverka){
            try {
                System.out.println("Какое животное добавить 1 - кот 2 - собака 3 - лягушка " +
                        "4 - вывести список животного 5 добавить в группу 6 - выход");
                n=in.nextInt();
                switch (n){
                    case 1 :
                        Cat.add();
                        break;
                    case 2 :
                        Dog.add();
                        break;
                    case 3 :
                        Frog.add();
                        break;
                    case 4 :
                        System.out.println("Какое животное вывести 1 - кот 2 - собака 3 - лягушка");
                        Scanner vvod = new Scanner(System.in);
                        k=vvod.nextInt();
                        switch (k){
                            case 1 :
                                Noah.sort(Cat.cats);
                                break;
                            case 2 :
                                Noah.sort(Dog.dogs);
                                break;
                            case 3 :
                                Noah.sort(Frog.frogs);
                            default:
                                break;
                        }
                        break;
                    case 5 :
                        try {Noah.addtosquad(Cat.cats);
                        Noah.addtosquad(Dog.dogs);
                        Noah.addtosquad(Frog.frogs);
                        System.out.println(Noah.squad);}
                        catch (IndexOutOfBoundsException e){
                            System.out.println("Недостаточкно животных");
                        }
                        break;
                        case 6 :
                        proverka = false;
                        break;
                    default:
                        break;

                }
            }
            catch (InputMismatchException e){
                System.out.println("Введите число");
            }
        }
    }
}

