import java.util.*;

public class armul {
    public static void main(String[] args) {

        int [][] num1 = {
            {1,2,3,4,5},
            {6,7,8,9,10}
        };

        printArray(num1);
        System.out.println();
        
        int [][] num = new int[5][4];

        System.out.println(Arrays.deepToString(num));
        
        System.out.println();

        // for
        for (int i = 0; i < num.length;i++) {
            System.out.print("[");
            for (int j = 0;j < num[i].length;j++) {
                System.out.print(num[i][j] + ",");
            }
            System.out.print("]\n");
        }

        System.out.println();

        //for each

        for (int [] baris : num) {
            System.out.print("[");
            for (int kolom : baris) {
                System.out.print(kolom + ",");
            }
            System.out.print("]\n");
        }

        System.out.println();

        printArray(num);

    }

    private static void printArray(int [] [] dataArray) {
        for (int [] baris : dataArray) {
            System.out.print("[");
            for (int kolom : baris) {
                System.out.print(kolom + ",");
            }
            System.out.print("]\n");
        }
    }
}
