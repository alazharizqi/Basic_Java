import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        
        int angka[] = {1, 2, 3, 4};

        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka[3]);
        System.out.println(Arrays.toString(angka));

        angka [1] = 100;

        System.out.println(Arrays.toString(angka));

        // deklarasi array

        int [] num = new int[5];

        System.out.println(Arrays.toString(num));
        
        num [0] = 100;
        
        System.out.println(Arrays.toString(num));

    }
}
