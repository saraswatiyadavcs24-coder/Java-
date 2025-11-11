import java.util.Scanner;

class Account {
    String name, type, accNo;
    double balance;
    Scanner sc = new Scanner(System.in);

    Account(String n, String a, String t) {
        name = n;
        accNo = a;
        type = t;
        balance = 0;
    }

    void deposit() {
        System.out.print("Enter the deposit amount: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Deposited: " + amt + ". Updated balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter the withdrawal amount: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Type of Account: " + type);
        System.out.println("Account Balance: " + balance);
    }
}

class SavAcct extends Account {
    SavAcct(String n, String a) {
        super(n, a, "saving");
    }

    void interest() {
        double i = balance * 0.04;
        balance += i;
        System.out.println("Interest added: " + i + ". Updated balance: " + balance);
    }
}

class CurAcct extends Account {
    CurAcct(String n, String a) {
        super(n, a, "current");
    }

    void checkMin() {
        if (balance < 1000) {
            balance -= 50;
            System.out.println("Penalty charged! Updated balance: " + balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String n1 = sc.nextLine();
        System.out.print("Enter account number: ");
        String a1 = sc.nextLine();
        SavAcct s = new SavAcct(n1, a1);

        System.out.print("Enter customer name: ");
        String n2 = sc.nextLine();
        System.out.print("Enter account number: ");
        String a2 = sc.nextLine();
        CurAcct c = new CurAcct(n2, a2);

        while (true) {
            System.out.println("\n------MENU------");
            System.out.println("1.Deposit  2.Withdraw  3.Interest  4.Display  5.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Account type (saving/current): ");
            String t = sc.nextLine().trim();

            Account acc = t.equalsIgnoreCase("saving") ? s : c;

            switch (ch) {
                case 1:
                    acc.deposit();
                    break;
                case 2:
                    acc.withdraw();
                    if (acc instanceof CurAcct)
                        ((CurAcct) acc).checkMin();
                    break;
                case 3:
                    if (acc instanceof SavAcct)
                        ((SavAcct) acc).interest();
                    else
                        System.out.println("No interest for current account.");
                    break;
                case 4:
                    acc.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
