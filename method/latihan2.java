import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        
        System.out.println("LUAS DAN KELILING PERSEGI DENGAN METHOD");

        Scanner scanner = new Scanner(System.in);

        String lagi;

        do {
            System.out.print("Masukkan sisi = ");
            int angka = scanner.nextInt();

            System.out.println("Keliling persegi = " +keliling(angka));
            System.out.println("Luas persegi = " +luas(angka));

            System.out.print("mau input lagi ? (y/n) ");
            lagi = scanner.next();

        } while (lagi.equals("y"));

    }

    private static int keliling (int sisi) {

        int hasil;
        hasil = sisi * 4;
        return hasil;

    }

    private static int luas (int sisi) {

        int hasil;
        hasil = sisi * sisi;
        return hasil;

    }
}
