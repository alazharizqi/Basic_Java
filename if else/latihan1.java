import java.util.Scanner;
public class latihan1 {

    public static void main(String[] args) {
        System.out.println("Rumus Menghitung\n");
        System.out.println("1. Keliling Persegi");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Keliling Persegi Panjang");
        System.out.println("4. Luas Persegi Panjang\n");

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pilih angka 1 - 4 = ");
        String input_angka = scanner.next();
        System.out.println("");

        if (input_angka.equals("1")) {
            System.out.print("Masukkan sisi : ");
            int sisi = scanner.nextInt();
            int kel = sisi * 4;
            System.out.println("Keliling Persegi = " + kel+"\n");
        } else if (input_angka.equals("2")) {
            System.out.print("Masukkan sisi : ");
            int sisi = scanner.nextInt();
            int luas = sisi * sisi;
            System.out.println("Luas persegi = "+luas+"\n");
        } else if (input_angka.equals("3")) {
            System.out.print("Masukkan panjang : ");
            int panjang = scanner.nextInt();
            System.out.print("Masukkan lebar : ");
            int lebar = scanner.nextInt();
            int kel = 2 * (panjang + lebar);
            System.out.println("Keliling persegi panjang = "+kel+"\n");
        } else if (input_angka.equals("4")) {
            System.out.print("Masukkan panjang : ");
            int panjang = scanner.nextInt();
            System.out.print("Masukkan lebar : ");
            int lebar = scanner.nextInt();
            int luas = panjang * lebar;
            System.out.println("Luas persegi panjang = "+luas+"\n");
        } else {
            System.out.println("inputan tidak dimengerti!!!\n");
        }

        System.out.println("Program selesai!!!");

    }
    
}