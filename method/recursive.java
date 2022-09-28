import java.util.Scanner;

public class recursive {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = scanner.nextInt();

        PrintNilai(nilai);
        int jumlah = JumlahNilai(nilai);
        System.out.println("Jumlah nilai = " + jumlah);

        int hasilfaktor = hitungfaktorial(nilai);
        System.out.println("hasil faktor = " + hasilfaktor);

    }

    private static void PrintNilai (int parameter) {
        System.out.println("Nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter --;

        PrintNilai(parameter);
    }

    private static int JumlahNilai (int parameter) {
        System.out.println("Parameter = " +parameter);
        if ( parameter == 0) {
            return parameter;
        }
        return parameter + JumlahNilai(parameter - 1); 
    }

    private static int hitungfaktorial (int parameter) {
        System.out.println("Parameter = " +parameter);
        if ( parameter == 1) {
            return parameter;
        }
        return parameter * hitungfaktorial(parameter - 1); 
    }

}