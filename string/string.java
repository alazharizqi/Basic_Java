public class string {
    public static void main(String[] args) {
        
        String nama = "Azhar";
        String nama1 = "Zharsuke";

        System.out.println("Nama saya "+ nama);

        // format biasa

        System.out.println(String.format("Nama saya %s", nama));

        // format argument index

        System.out.println(String.format("Halo %1$s, nama saya adalah %2$s, salam kenal ya %1$s", nama, nama1));


        // flags

        int num1 = 5;
        int num2 = 10;
        int hasil = num1 + num2;

        System.out.println(String.format("%d + %d = %+d", num1, num2, hasil));

        double nilai = 2.5;

        System.out.println(String.format("Nilai adalah %f", nilai));

    }
}
