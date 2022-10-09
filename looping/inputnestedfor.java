import java.util.Scanner;

public class inputnestedfor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int line, column;

        System.out.print("Input line : ");
        line = scanner.nextInt();
        System.out.print("Input Column : ");
        column = scanner.nextInt();
        
        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < column;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}
