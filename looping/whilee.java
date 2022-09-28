public class whilee {
    public static void main(String[] args) {
        
        int i = 0;
        int a = 0;
        boolean kondisi = true;

        while (true) {
            System.out.println("Angka ke " + i);
            i++;

            if (i > 10) {
                break;
            }

        }

        while (kondisi) {
            System.out.println("===");
            a++;

            if (a > 10) {
                kondisi = false;
            }

        }

    }
}
