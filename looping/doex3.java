import java.util.*;
import java.lang.Math;

public class doex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x, y;
        String choices;

        do {
            
            System.out.print("input x : ");
            x = scanner.nextInt();
            System.out.print("input y : ");
            y = scanner.nextInt();
            System.out.println(Math.pow(x, y));
            System.out.print("input again ? <y/n>");
            choices = scanner.next();

            if (choices.equalsIgnoreCase("n")) {
                break;
            }

        } while (true);

    }
}
