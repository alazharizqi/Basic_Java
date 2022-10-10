import java.util.*;

public class atm {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int pin, menu, type_of_saving, transfer, rekening, change_pin;
        double money;
        String choice;

        do {

            System.out.print("Input pin : ");
        pin = scanner.nextInt();

        if (pin == 123456) {
            System.out.println("Menu");
            System.out.println("1. Withdrawal");
            System.out.println("2. Transfer");
            System.out.println("3. Change pin");
            System.out.print("Input menu (1/2/3) : ");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.println("Type of saving");
                System.out.println("1. Giro");
                System.out.println("2. Deposito");
                System.out.println("Input type of saving (1/2) : ");
                type_of_saving = scanner.nextInt();

                if ( type_of_saving == 1) {
                    System.out.print("Enter amount money : ");
                    money = scanner.nextDouble();
                    System.out.println("Your money = " + money);
                } else if (type_of_saving == 2) {
                    System.out.print("Enter amount money : ");
                    money = scanner.nextDouble();
                    System.out.println("Your money = " + money);
                    
                } else {
                    System.out.println("Your input is invalid!!!");
                }
            } else if (menu == 2) {
                System.out.println("Transfer");
                System.out.println("1. BRI");
                System.out.println("2. BNI");
                System.out.println("3. Mandiri");
                System.out.println("4. Bukopin");
                System.out.println("5. BCA");
                System.out.print("Enter bank code (1/2/3/4/5) : ");
                transfer = scanner.nextInt();

                if (transfer == 1) {
                    System.out.print("Enter destination account : ");
                    rekening = scanner.nextInt();
                    System.out.println("Enter amount money : ");
                    money = scanner.nextInt();
                    System.out.println("Your destination account = " + rekening);
                    System.out.println("Your amount money = " + money);
                } else if (transfer == 2) {
                    System.out.print("Enter destination account : ");
                    rekening = scanner.nextInt();
                    System.out.println("Enter amount money : ");
                    money = scanner.nextInt();
                    System.out.println("Your destination account = " + rekening);
                    System.out.println("Your amount money = " + money);
                    
                } else if (transfer == 3) {
                    System.out.print("Enter destination account : ");
                    rekening = scanner.nextInt();
                    System.out.println("Enter amount money : ");
                    money = scanner.nextInt();
                    System.out.println("Your destination account = " + rekening);
                    System.out.println("Your amount money = " + money);
                    
                } else if (transfer == 4) {
                    System.out.print("Enter destination account : ");
                    rekening = scanner.nextInt();
                    System.out.println("Enter amount money : ");
                    money = scanner.nextInt();
                    System.out.println("Your destination account = " + rekening);
                    System.out.println("Your amount money = " + money);
                    
                } else if (transfer == 5) {
                    System.out.print("Enter destination account : ");
                    rekening = scanner.nextInt();
                    System.out.println("Enter amount money : ");
                    money = scanner.nextInt();
                    System.out.println("Your destination account = " + rekening);
                    System.out.println("Your amount money = " + money);
                    
                } else {
                    System.out.println("Your input is invalid!!!");
                }
            } else if (menu == 3) {
                System.out.print("Enter your new pin : ");
                change_pin = scanner.nextInt();
                System.out.println("Your new pin : " + change_pin);
            }

        } else {
            System.out.println("Your pin is wrong!");
        }

            System.out.print("Input again (y/n) : ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Program has done!!!");

    }
}
