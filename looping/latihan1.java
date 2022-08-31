import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        
        System.out.println("DO WHILE SEDERHANA\n");
        Scanner scanner = new Scanner(System.in);
        String lanjut;

        do {
            System.out.print("Masukkan inputan : ");
            String input = scanner.next();

            System.out.println("Inputan adalah "+input);

            System.out.print("lanjut lagi(y/n) ?");
            lanjut = scanner.next();
        } while (lanjut.equals("y"));

    }
}
