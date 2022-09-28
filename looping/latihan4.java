import java.util.*;

public class latihan4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int total;

        System.out.print("Masukkan nilai awal : ");
        int nilaiAwal = scanner.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        int nilaiAkhir = scanner.nextInt();

        total = 0;

        do {
            total += nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " sama dengan " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);
        

    }
}
