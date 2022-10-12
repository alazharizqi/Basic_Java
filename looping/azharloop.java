public class azharloop {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                if (i == 0 && j == 0) {
                    System.out.print("A ");
                    continue;
                } else if (i == 0 && j == 1) {
                    System.out.print("Z ");
                    continue;
                } else if (i == 0 && j == 2) {
                    System.out.print("H ");
                    continue;
                } else if (i == 0 && j == 3) {
                    System.out.print("A ");
                    continue;
                } else if (i == 0 && j == 4) {
                    System.out.print("R ");
                    continue;
                } else if (i == 1 && j == 0) {
                    System.out.print("Z ");
                    continue;
                } else if (i == 2 && j == 0) {
                    System.out.print("H ");
                    continue;
                } else if ( i == 3 && j == 0) {
                    System.out.print("A ");
                    continue;
                } else if (i == 4 && j == 0) {
                    System.out.print("R ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
