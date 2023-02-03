import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(0.0);

        while (true) {
            System.out.println("Enter 1 to deposit");
            System.out.println("Enter 2 to withdraw");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the amount to be deposited: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
                System.out.println("Your updated balance is: " + account.checkBalance());
            } else if (choice == 2) {
                System.out.print("Enter the amount to be withdrawn: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                System.out.println("Your updated balance is: " + account.checkBalance());
            } else if (choice == 3) {
                System.out.println("Your current balance is: " + account.checkBalance());
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}