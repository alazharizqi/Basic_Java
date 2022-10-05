import java.util.*;

public class assignment3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String day, type_of_clothe;
        int number_of_clothe;

        System.out.print("input day : ");
        day = scanner.next();

        if (day.equals("saturday")) {

            System.out.print("Input type of clothes : ");
            type_of_clothe = scanner.next();
            System.out.print("Input number of clothes : ");
            number_of_clothe = scanner.nextInt();

            

        } else {
            System.out.println("KONTOLLL");
        }

    }    
}
