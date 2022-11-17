import java.util.*;

public class try_catch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] num = {1,2,3,4,5,};
        System.out.print("Insert index of array to search : ");
        int index = scanner.nextInt();

        try {
            System.out.println("Index " + index + " is " + num[index]);
        } catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }

        System.out.println("Program has ended");

        scanner.close();

    }
}
