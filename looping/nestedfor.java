public class nestedfor {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
                if ( (i + j) == 9) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("* ");
                if ( i == j) {
                    break;
                } else if ((i+j) == 10) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i+j) > 6) {
                    break;
                } else if ((j >= 2) && (j-i) > 2) {
                    break;
                } else if ((j <= 2) && (i+j) < 2) {
                    System.out.print("  ");
                    continue;
                } else if ((i >= 2) && (i-j) > 2) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10;i++) {
            for (int j = 0; j < 10;j++) {
                if ((i+j) < 9) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            } 
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10;i++) {
            for (int j = 0; j < 10;j++) {
                if ((i+j) > 9) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            } 
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 20;i++){
            for (int j = 0;j < 10;j++) {
                if ((i+j) < 9) {
                    System.out.print("  ");
                    continue;
                } else if ( (i+j) > 18) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 20;i++) {
            for (int j = 0; j < 10;j++) {
                if (i == j) {
                    break;
                } else if ((i > 10) && (i-j) > 10) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 11;i++) {
            for (int j=0; j < 11;j++) {
                if ((i<5) && (i+j) < 5) {
                    System.out.print("  ");
                    continue;
                } else if ((j>5) && (j-i) > 5) {
                    System.out.print(" ");
                    continue;
                } else if ((i>5) && (i+j) > 5) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0;i < 10; i++) {
            for (int j = 0; j < 10;j++) {
                if ((i+j) < 9) {
                    System.out.print("  ");
                    continue;
                } else if ((i+j) > 9) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <= 10;i++) {
            for (int j = 0;j <= 10;j++) {
                if (i==j) {
                    break;
                } else if (i>1 && (i-j) >1) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
