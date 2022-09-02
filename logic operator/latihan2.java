import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        // ----1++++5----11+++++15-----

        System.out.println("Operator logic sederhana\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 1 sampai 5 dan 11 sampai 15 : ");
        int input = scanner.nextInt();

        boolean lebih1 = input >= 1;
        boolean kurang1 = input <= 5;
        boolean benar1 = lebih1 && kurang1;

        boolean lebih2 = input >= 11;
        boolean kurang2 = input <= 15;

        boolean benar2 = lebih2 && kurang2;

        boolean benar3 = benar1 || benar2;

        System.out.println("Nilai : "+benar3);

    }
}
