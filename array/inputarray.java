import java.util.Arrays;
import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter element of array : ");
        num = scanner.nextInt();

        int [] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Input number : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array = " + Arrays.toString(arr));
        scanner.close();
    }
}
