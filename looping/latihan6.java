import java.util.*;

public class latihan6 {
    public static void main(String[] args) {
        
        // MENAMPILKAN BILANGAN GANJIL DAN GENAP DENGAN LOOPING

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int nilaiAwal = scanner.nextInt();
        System.out.print("Masukkan bilangan : ");
        int nilaiAkhir = scanner.nextInt();

        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {

            if (i % 2 != 0) {
                System.out.println("Bilangan ganjil = " + i);
            }

        }

        System.out.println();

        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {

            if (i % 2 == 0) {
                System.out.println("Bilangan genap = " + i);
            }

        }

        System.out.println();

        for (int i = nilaiAwal; i <= nilaiAkhir;i++) {
            System.out.println("Bilangan = " + i);
        }

    }
}
