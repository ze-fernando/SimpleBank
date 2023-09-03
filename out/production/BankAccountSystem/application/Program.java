package application;

import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = in.nextInt();
        in.nextLine();
        System.out.print("Holder: ");
        String holder = in.nextLine();
        System.out.print("Initial balance: ");
        double balance = in.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdraw = in.nextDouble();
        Account acc = new Account(number, holder, balance, withdraw);

        try {
            System.out.print("Enter amount for withdraw: ");
            double wdraw = in.nextDouble();
            acc.withdraw(wdraw);
            System.out.println(acc);
        } catch (DomainException var11) {
            System.out.println("Error in withdraw: " + var11.getMessage());
        }

        in.close();
    }
}
