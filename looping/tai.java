public class tai {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10;i++) {
            for (int j = 0; j < 10;j++) {
                if (i == j) {
                    break;
                }

                System.out.print("* ");
            }  
            System.out.println();
        }

        System.out.println();

        for (int i = 0;i < 10;i++) {
            for (int j = 0;j < 10;j++) {
                if ( (i+j) < 9) {
                    System.out.print("  ");
                    continue;
                }
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 4) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        int x = 0;

        do {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < 4);
            System.out.println();
            x++;
        } while (x < 4);

    }
}
