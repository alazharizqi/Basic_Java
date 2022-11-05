import java.util.*;

public class ass2 {
    public static void main(String[] args) {
        
        Integer [] num = {1,2,3,4,5};
        // System.out.println(num.length);

        // Arrays.sort(num, Collections.reverseOrder());
        // System.out.println(Arrays.toString(num));

        // System.out.println();

        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]);
        }
    }
}