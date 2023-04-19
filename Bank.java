import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        String name = "Name: Caio Torves";
        String account = "Type Account: Current Account";
        double balance = 2500.00;


        System.out.println("**********************");
        System.out.println("CLIENT DATA");
        System.out.println(name);
        System.out.println(account);
        System.out.println("Balance: R$ 2500,00\n");
        System.out.println("**********************\n");

        String menuOptions = """
                OPERATIONS:


                1 - CONSULT BALANCE
                2 - DEPOSIT
                3 - TRANSFER
                4 - EXIT

                """;

        Scanner reading = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            System.out.println(menuOptions);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println(balance);
            } else if (option == 2) {
                System.out.println("Enter your transfer");
                double transfer = reading.nextDouble();
                if (transfer > balance) {
                    System.out.println("Your balance is insufficient");
                } else {
                    balance -= transfer;
                    System.out.println("New balace is " + balance);
                }
            } else if (option == 3) {
                System.out.println("Insert your deposit");
                double deposit = reading.nextDouble();
                balance += deposit;
                System.out.println("New balace is " + balance);
            } else if (option != 4) {
                System.out.println("Invalid Option");
            }

        }
    }
}
