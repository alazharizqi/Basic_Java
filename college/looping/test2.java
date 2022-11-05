package college.looping;
import java.util.*;

public class test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Insert number (min 5) : ");
        num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if (num < 5) {
                    break;
                }
                if ((i+j) > num) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
