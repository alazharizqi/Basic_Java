public class looping0 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                if (j < 5 && i == 0) {
                    System.out.print("0 ");
                    continue;
                } else if (i < 5  && j < 1) {
                    System.out.print("0 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int i = 0; i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                if (j > 3 || i > 3) {
                    System.out.print("0 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                if (j > 3 ) {
                    System.out.print("0 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                if (i < 5 && j == 0) {
                    System.out.print("0 ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


    }    
}
