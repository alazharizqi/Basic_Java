import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lagi;

        do {

            System.out.print("Masukkan angka untuk membentuk bintang = ");
            int angka = scanner.nextInt();

            bintang(angka);

            System.out.print("Mau input lagi ? (y/n)");
            lagi = scanner.next();

        } while (!lagi.equals("n"));

    }

    private static void bintang (int p) {

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
