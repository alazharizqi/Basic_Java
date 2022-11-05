import java.util.*;

public class inputarray2dimensi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Integer line, column;

        System.out.print("Insert amount line : ");
        line = scanner.nextInt();
        System.out.print("Insert amount column : ");
        column = scanner.nextInt();

        Integer [][] arr = new Integer[line][column];

        System.out.println();

        // System.out.println(arr.length);
        // System.out.println(arr[column].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Insert column " + j + " from index " + i + " : ");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Data Array = {");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j < arr[i].length && j > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i][j]);
            }
            System.out.print("]\n");
        }
        System.out.println("}");

        System.out.println();

        System.out.println("Data Array After Sorting = {");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            Arrays.sort(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                if ( j < arr[i].length && j > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i][j]);
            }
            System.out.print("]\n");
        }
        System.out.println("}");

        System.out.println();

        System.out.println("Data Array After Reverse Sorting = {");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            Arrays.sort(arr[i], Collections.reverseOrder());
            for (int j = 0; j < arr[i].length; j++) {
                if ( j < arr[i].length && j > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i][j]);
            }
            System.out.print("]\n");
        }
        System.out.println("}");

        scanner.close();
    }
}
