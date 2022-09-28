public class dowhile {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        boolean kondisi = true;

        do {
            System.out.println("SLIWIK");
            x++;

            if (x == 10) {
                kondisi = false;
            }

        } while (kondisi);

        do {
            System.out.println("COK");
            y++;
            if (y == 10) {
                break;
            }

        } while (true);

    }
}
