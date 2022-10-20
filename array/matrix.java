import java.util.*;

public class matrix {
    public static void main(String[] args) {
        
        int [][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int [][] b = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };

        System.out.println("matrix a = ");
        printArray(a);
        System.out.println();
        System.out.println("matrix b = ");
        printArray(b);

        System.out.println();

        System.out.println("hasil matrix a + matrix b = ");
        int [][] hasiltambah = tambah(a, b);
        printArray(hasiltambah);

        System.out.println();

        System.out.println("hasil matrix b - matrix a = ");
        int [][] hasilkurang = kurang(b, a);
        printArray(hasilkurang);

        System.out.println();

        // Kali

        int [][] c = {
            {1,2},
            {3,4}
        };

        int [][] d = {
            {11,12},
            {13,14}
        };

        System.out.println("matrix c = ");
        printArray(c);
        System.out.println();
        System.out.println("matrix d = ");
        printArray(d);

        System.out.println();

        int baris_c = c.length;
        int kolom_c = c[0].length;

        int baris_d = d.length;
        int kolom_d = d[0].length;

        int [][] hasilkali = new int[baris_c][kolom_d];

        int buffer;

        for (int i = 0; i < baris_c; i++) {
            for (int j = 0; j < kolom_d; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_c; k++) {
                    buffer += c[i][k] * d[k][j];
                }
                hasilkali[i][j] = buffer;
            }
        }

        System.out.println("perkalian matrix = ");
        printArray(hasilkali);

        // System.out.println("hasil matrix a * matrix b = ");
        // int [][] hasilkali = kali(a, b);
        // printArray(hasilkali);

    }

    private static int[][] tambah (int[][] matrix_1, int[][] matrix_2) {
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int [][] hasil = new int [baris_a][kolom_a];

        if (baris_a == baris_b && kolom_a == kolom_b) {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_a; j++) {
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("jumlah baris atau kolom tidak sama");
        }

        return hasil;
    }

    // private static int[][] kali (int[][] matrix_1, int[][] matrix_2) {
    //     int baris_a = matrix_1.length;
    //     int kolom_a = matrix_1[0].length;

    //     int baris_b = matrix_2.length;
    //     int kolom_b = matrix_2[0].length;

    //     int [][] hasil = new int [baris_a][kolom_a];

    //     if (baris_a == baris_b && kolom_a == kolom_b) {
    //         for (int i = 0; i < baris_a; i++) {
    //             for (int j = 0; j < kolom_a; j++) {
    //                 hasil[i][j] = matrix_1[i][j] * matrix_2[i][j];
    //             }
    //         }
    //     } else {
    //         System.out.println("jumlah baris atau kolom tidak sama");
    //     }
    //     return hasil;
    // }

    private static int[][] kurang (int[][] matrix_1, int[][] matrix_2) {
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int [][] hasil = new int [baris_a][kolom_a];

        if (baris_a == baris_b && kolom_a == kolom_b) {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_a; j++) {
                    hasil[i][j] = matrix_1[i][j] - matrix_2[i][j];
                }
            }
        } else {
            System.out.println("jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static void printArray(int [][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom;j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }

}
