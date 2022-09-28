public class umur {
    public static void main(String[] args) {
        
        int x, y, z;
        x = 10;
        y = tambah(x);
        z = kurang(x);

        System.out.println("nilai = "+ y);
        
        test("cok");

        System.out.println("Nilai = "+z);

        halo("azhar");
        halo("zharsuke");
        halo("ajar");
        halo("jarjar");


    }
    private static int tambah(int input) {

        int hasil;

        hasil = input + 100;

        return hasil;
        
    }

    private static int kurang (int input) {

        int hasil;
        hasil = input - 100;
        return hasil;

    }

    private static void test (String input) {

        System.out.println(input);
        
    }

    private static void halo (String nama) {
        System.out.println("Halo "+ nama);
    }

}
