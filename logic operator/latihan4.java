import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        
        // -----100++++150-----

        System.out.println("LATIHAN COKKKKKK");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 100 sampai 150 : ");
        int input = scanner.nextInt();

        boolean lebih1 = input > 100;
        boolean kurang1 = input <= 150;

        boolean arsir = lebih1 && kurang1;


        System.out.println("Nilai : "+arsir);




    }
}
