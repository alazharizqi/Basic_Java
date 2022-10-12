public class nesteddowhile {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        do {
            do {
                j++;
                System.out.print("= ");
                
            } while (j < 10);
            i++;
            System.out.print("* ");
            System.out.println();
        } while (i < 5);
    }    
}
