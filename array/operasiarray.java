import java.util.Arrays;

public class operasiarray {
    public static void main(String[] args) {
        
        // array to string
        int [] num1 = {1,2,3,4,5};
        printArray(num1);
        System.out.println(num1);

        System.out.println();
        
        // copy array
        int [] num2 = Arrays.copyOf(num1, 5);
        printArray(num1);
        printArray(num2);
        System.out.println(num1);
        System.out.println(num2);
        
        System.out.println();
        
        //copy array with range
        int [] num3 = Arrays.copyOfRange(num1, 1, 4);
        printArray(num1);
        printArray(num3);
        System.out.println(num1);
        System.out.println(num3);

        System.out.println();
        
        // fill array
        int [] num4 = new int[10];
        printArray(num4);
        Arrays.fill(num4, 3);
        printArray(num4);

        System.out.println();

        // array comparation
        int [] num5 = {1,2,3,4,5};
        int [] num6 = {6,7,8,9,10};
        printArray(num5);
        printArray(num6);
        if (Arrays.equals(num5, num6)) {
            System.out.println("this array same");
        } else {
            System.out.println("this array different");
        }

        System.out.println();

        // check who array bigger than
        int [] num7 = {1,2,10,4,5};
        int [] num8 = {1,2,3,4,5};
        printArray(num7);
        printArray(num8);
        System.out.println("The array who bigger is Array "+Arrays.compare(num7, num8));
        // if result 0, then compare array same
        // if result 1, then compare array 1 bigger then array 2
        // if result -1, then compare array 2 bigger than array 1

        // check array who different by index
        System.out.println("the array who different is index " + Arrays.mismatch(num7, num8));
        
        System.out.println();

        // sorting array
        int [] num9 = {6,4,6,8,5,3,4,7,3,5,6,3,4};
        printArray(num9);
        Arrays.sort(num9);
        printArray(num9);

        System.out.println();

        // search array
        int number = 7;
        int index = Arrays.binarySearch(num9, number);
        System.out.println("Number " + number + " it is in index " + index);

        // reverse sorting array
        // combine 2 array
        // plus operation between 2 array

    }

    private static void printArray (int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
    }
}
