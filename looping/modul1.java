import java.util.*;

public class modul1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 11; i <= 188;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 1; i <= 256; i*=2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i <=30; i++) {
            System.out.println(i);
        }

        System.out.println();

        int x, y, result;
        String choice;

        do {
            System.out.print("Input x number : ");
            x = scanner.nextInt();
            System.out.print("Input y number : ");
            y = scanner.nextInt();

            System.out.println("Result " + x + " ** " + y + " = " + Math.pow(x, y));

            System.out.print("Input again ? (y/n) : ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("y"));

    }
}
