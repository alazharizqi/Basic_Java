import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1 : ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan operator (+,-,*,/) : ");
        String operator = scanner.next();
        System.out.print("Masukkan angka 2 : ");
        int angka2 = scanner.nextInt();
        System.out.println("");

        if (operator.equals("+")) {
            int hasil = angka1 + angka2;
            System.out.println("Hasil "+angka1+" + "+angka2+" = "+hasil+"\n");
        } else if (operator.equals("-")) {
            int hasil = angka1 - angka2;
            System.out.println("Hasil "+angka1+" - "+angka2+" = "+hasil+"\n");
        } else if (operator.equals("*")) {
            int hasil = angka1 * angka2;
            System.out.println("Hasil "+angka1+" * "+angka2+" = "+hasil+"\n");
        } else if (operator.equals("/")) {
            int hasil = angka1 / angka2;
            System.out.println("Hasil "+angka1+" / "+angka2+" = "+hasil+"\n");
        } else {
            System.out.println("Inputan tidak diketahui!!!\n");
        }
        System.out.println("Program selesai");

    }
}
