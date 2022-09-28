import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        
        int [] num1 = {1,2,3,4,5};
        int [] num2 = new int[5];

        System.out.println(num1);
        System.out.println(num2);

        num2 = num1;

        System.out.println("num 1 = " + Arrays.toString(num1));
        System.out.println("num 2 = " + Arrays.toString(num2));
        
        num1 [0] = 100;
        num2 [4] = 500;
        System.out.println("num 1 = " + Arrays.toString(num1));
        System.out.println("num 2 = " + Arrays.toString(num2));
        
        ubahArray(num1);
        System.out.println("num 1 = " + Arrays.toString(num1));
        System.out.println("num 2 = " + Arrays.toString(num2));

    }

    private static void ubahArray (int [] angka) {
        angka[0] = 150;
    }

}
