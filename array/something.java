public class something {
    public static void main(String[] args) {
        
        char [] name = {'A', 'L', 'A', 'Z', 'H', 'A', 'R', 'R', 'I', 'Z', 'Q', 'I', 'R', 'I', 'F', 'A', 'I', 'F', 'I', 'R', 'D', 'A', 'U', 'S'};

        char [][] new_name = new char[8][5];

        int k = 0;

        for (int i = 0; i < new_name.length; i++) {
            for (int j = 0; j < new_name[0].length; j++) {
                new_name[i][j] = name[k];
                k++;
                System.out.print(new_name[i][j] + " ");
            }
            System.out.println();
        }

    }
}