import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        /// MEMBUAT NILAI TRUE KURANG DARI 5 DAN LEBIH DARI 10
        System.out.println("CASE OR\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka kurang dari 5 atau lebih dari 10 : ");
        int input = scanner.nextInt();

        Boolean kurang = input < 5;
        boolean lebih = input > 10;
        boolean benar = kurang || lebih;
        System.out.println("Nilai = "+benar);

        /// MEMBUAT IRISAN 5 - 10
        System.out.println("CASE AND\n");

        System.out.println("Masukkan angka antara 5 - 10 : ");
        int input1 = scanner.nextInt();
        
        boolean lebih1 = input1 > 5;
        boolean kurang1 = input1 < 10;
        boolean hasil1 = lebih1 && kurang1;
        System.out.println("Nilai = "+hasil1);
    }
}
