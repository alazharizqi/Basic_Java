import java.util.*;

public class reversesorting {
    public static void main(String[] args) {
        
        Integer [] num = {54,5,4,7,564,53,5,32,32,423,4,32};
        System.out.println("Random data array");
        System.out.println("Data = " + Arrays.toString(num) + "\n");
        
        Arrays.sort(num);
        System.out.println("Sorting data array");
        System.out.println("Data = " + Arrays.toString(num) + "\n");
        
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Reverse sorting data array");
        System.out.println("Data = " + Arrays.toString(num) + "\n");

    }
}
