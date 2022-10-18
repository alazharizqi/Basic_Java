import java.lang.Math;
import java.util.*;

public class forex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int x, y;
        boolean stop = false;
        String choices;

        for (; !stop; ) {

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

        }

    }
}
