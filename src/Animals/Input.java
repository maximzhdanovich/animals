package Animals;

import java.util.Scanner;

public abstract class Input {
    public static String inputStringbyconsole(){
        Scanner in =new Scanner(System.in);
        return in.nextLine();
    }

    public static int inputNumcerbyconcole(){
        Scanner in =new Scanner(System.in);
        return in.nextInt();
    }
}
