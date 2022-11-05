import java.util.*;

public class inputmatrixtambah {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int line1, column1, line2, column2;
        String choices;

        do {
            System.out.print("Insert amount line from matrix a : ");
        line1 = scanner.nextInt();
        System.out.print("Insert amount column from matrix a : ");
        column1 = scanner.nextInt();

        int [][] matrix_a = new int[line1][column1];

        System.out.println();

        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_a[i].length; j++) {
                System.out.print("Insert column " + j + " from index " + i + " matrix a : ");
                matrix_a[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Insert amount line from matrix b : ");
        line2 = scanner.nextInt();
        System.out.print("Insert column from matrix b : ");
        column2 = scanner.nextInt();

        int [][] matrix_b = new int[line2][column2];

        System.out.println();

        for (int i = 0; i < matrix_b.length; i++) {
            for (int j = 0; j < matrix_b[i].length; j++) {
                System.out.print("Insert column " + j + " from index " + i + " matrix b : ");
                matrix_b[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix A = {");

        for (int i = 0; i < matrix_a.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix_a[i].length; j++) {
                if (j < matrix_a[i].length && j > 0) {
                    System.out.print(",");
                }
                System.out.print(matrix_a[i][j]);
            }
            System.out.print("]\n");
        }
        System.out.println("}");

        System.out.println("     +     ");

        System.out.println("Matrix B = {");

        for (int i = 0; i < matrix_b.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix_b[i].length; j++) {
                if (j < matrix_b[i].length && j > 0) {
                    System.out.print(",");
                }
                System.out.print(matrix_b[i][j]);
            }
            System.out.print("]\n");
        }
        System.out.println("}");
        System.out.println("==========");

        int [][] result = new int[line1][line2];

        System.out.println("Result = {");

        if (matrix_a.length == matrix_b.length && matrix_a[0].length == matrix_b[0].length) {
            for (int i = 0; i < result.length; i++) {
                System.out.print("[");
                for (int j = 0; j < result[i].length; j++) {
                    if (j < result[i].length && j > 0) {
                        System.out.print(",");
                    }
                    result[i][j] = matrix_a[i][j] + matrix_b[i][j];
                    System.out.print(result[i][j]);
                }
                System.out.print("]\n");
            }
        } else {
            System.out.println("Amount line or column doesn't same!!!");
        }
        System.out.println("}");
        System.out.println();

            System.out.print("Input again you motherfucker (y/n) ? ");
            choices = scanner.next();
        } while (choices.equalsIgnoreCase("y"));
        scanner.close();
    }
}
