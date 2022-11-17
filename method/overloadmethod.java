public class overloadmethod {
    public static void main(String[] args) {

        int hasilInt;
        hasilInt = tambah(10, 5);

        float hasilFloat;
        hasilFloat = tambah(10.5f, 10.0f);
     
        printAngka(100);
        printAngka(100.5d);
        printAngka(100.76f);
        printAngka(hasilInt);
        printAngka(hasilFloat);

    }

    private static float tambah(float num1, float num2) {
        return num1 + num2;
    }

    private static int tambah(int num1, int num2) {
        return num1 + num2;
    }

    private static void printAngka(float angkaFloat) {
        System.out.println("number = " + angkaFloat);
    }

    private static void printAngka(double angkaDouble) {
        System.out.println("number = " + angkaDouble);
    }

    private static void printAngka(int angkaInt) {
        System.out.println("number = " + angkaInt);
    }

}