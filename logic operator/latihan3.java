import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
        
        // +++++1-----5+++++11-----15+++++

        System.out.println("Logic sederhana\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka kurang dari 1, 6 sampai 10, lebih dari 15 : ");
        int input = scanner.nextInt();

        boolean kurang1 = input < 1;
        
        boolean lebih1 = input > 5;
        boolean kurang2 = input <= 10;
        boolean arsir = lebih1 && kurang2;

        boolean lebih2 = input > 15;

        boolean bagian = kurang1 || lebih2;

        boolean total = arsir || bagian;



        System.out.println("Nilai : "+total);





    }
}
