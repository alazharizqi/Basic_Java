public class bublesort {
    public static void main(String[] args) {
        
        int [] num = {23,4,5,46,57,65,734,2,342,3546};

        int temp;

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length -1; j++) {
                if (num[j-1] > num[j]) {
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("After sorting");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+",");
        }

    }
}
