import java.util.*;

public class umur {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int year_now = calendar.get(Calendar.YEAR);
        int month_noww = calendar.get(Calendar.MONTH);
        int month_now = month_noww + 1;
        int day_now = calendar.get(Calendar.DATE);

        System.out.println(month_now + "/" + day_now + "/" + year_now);

        System.out.print("Input month of birth : ");
        int month = scanner.nextInt();
        System.out.print("Input day of birth : ");
        int day = scanner.nextInt();
        System.out.print("Input year of birth : ");
        int year = scanner.nextInt();
        
        System.out.println("Your birthdate : " + month + "/" + day + "/" + year);

        int age = year_now - year;
        int monthh = month_now - month;
        int dayy = day_now - day;

        if (monthh < 0) {
            monthh = 0;
        }
        if (dayy < 0) {
            dayy = 0;
        }
        

        System.out.println("Your age is " + age + " years, " + monthh + " month, " + dayy + " days.");


    }
}
