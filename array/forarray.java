import java.util.Arrays;

public class forarray {
    public static void main(String[] args) {
        
        int [] angka = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("length dari array = " + angka.length + "\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("angka = " + angka[i]);
        }

        System.out.println();
        
        for (int i = 0; i < angka.length; i++) {
            
            System.out.println("angka = " + angka[i]);

        }

        System.out.println();

        for (int i : angka) {
            System.out.println("angka = " + i);
        }

    }
}
