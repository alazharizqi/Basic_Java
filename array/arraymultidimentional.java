import java.util.*;

public class arraymultidimentional {
    public static void main(String[] args) {
        
        int [][] num = {
            {1,2,3},
            {4,5,6}
        };

        printArray(num);
        System.out.println();

        int [][] num1 = new int [3][3];

        printArray(num1);

        System.out.println();

        for (int i = 0; i < num1.length;i++) {
            System.out.print("[");
            for (int j = 0; j <num1[i].length;j++) {
                System.out.print(num1[i][j] + ",");
            }
            System.out.print("]");
            System.out.println();
        }

    }

    // private static void 

    private static void printArray(int [][] dataArray) {
        for (int i = 0; i < dataArray.length;i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

}
