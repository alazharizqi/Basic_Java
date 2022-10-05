import java.util.*;

public class sortingstring {
    public static void main(String[] args) {

        String [] arr = {"b", "c", "a"};
        System.out.println("Data = " + Arrays.toString(arr) + "\n");

        Arrays.sort(arr);
        System.out.println("Sorting array = " + Arrays.toString(arr) + "\n");
        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Reverse sorting array = " + Arrays.toString(arr) + "\n");

    }
}
