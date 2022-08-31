import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Apapun : ");
        String nama = input.next();
        System.out.println("Inputan adalah "+nama);
    }
}
