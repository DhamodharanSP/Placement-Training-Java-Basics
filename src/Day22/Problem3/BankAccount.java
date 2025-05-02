package Day22.Problem3;

import java.util.Scanner;

public interface BankAccount
{
    public void deposit(double amount);
    public void withDraw(double amount);
}

class SavingsAccount implements BankAccount
{
    private String name;
    private int accNo;
    private double balance;

    SavingsAccount(String name, int accNo)
    {
        this.name = name;
        this.accNo = accNo;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Amount deposited: $"+amount);
    }
    public void withDraw(double amount)
    {
        if(this.balance - amount >= 0)
        {
            this.balance -= amount;
            System.out.println("Amount withdrawed: $"+amount);
        }
        else System.out.println("Insufficient Balance... Unable to withdraw!");
    }
}

class CurrentAccount implements BankAccount
{
    private String name;
    private int accNo;
    private double balance, overDraftLimit;

    CurrentAccount(String name, int accNo)
    {
        this.name = name;
        this.accNo = accNo;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setOverDraftLimit(double overDraftLimit)
    {
        this.overDraftLimit = overDraftLimit;
    }


    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Amount deposited: $"+amount);
    }
    public void withDraw(double amount)
    {
        if(this.balance - amount >= overDraftLimit)
        {
            this.balance -= amount;
            System.out.println("Amount withdrawed: $"+amount);
        }
        else System.out.println("Insufficient Balance... Unable to withdraw!");
    }
}


class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Account type [ Savings | Current ] : ");
        String type = in.next().toLowerCase();

        if(type.equals("savings"))
        {
            System.out.print("Enter your name: ");
            String name = in.next();

            System.out.print("Enter your Account number: ");
            int acc = in.nextInt();

            System.out.println("Enter your current Balance: ");
            double balance = in.nextDouble();

            SavingsAccount bank = new SavingsAccount(name, acc);

            bank.setBalance(balance);

            System.out.println("\n--------------------------------------------\n");
            char ch = '0';
            while(ch!='q')
            {
                System.out.println("Press '1' to deposit amount");
                System.out.println("Press '2' to withdraw amount");
                System.out.println("Press '3 to check balance");
                int choice = in.nextInt();
                if(choice == 1)
                {
                    System.out.print("Enter amount to deposit: ");
                    double amt = in.nextDouble();
                    bank.deposit(amt);
                }
                else if(choice == 2)
                {
                    System.out.println("Enter amount to withdraw: ");
                    double amt = in.nextDouble();
                    bank.withDraw(amt);
                }
                else if(choice == 3)
                {
                    System.out.println("Current Balance: "+bank.getBalance());
                }
                else System.out.println("Invalid Input!\n");
                System.out.println("\n--------------------------------------------\n");
                System.out.println("Press any key to continue (or) Press 'q' to Quit");
                ch = in.next().charAt(0);
            }

        }
        else if(type.equals("current"))
        {
            System.out.print("Enter your name: ");
            String name = in.next();

            System.out.print("Enter your Account number: ");
            int acc = in.nextInt();

            System.out.print("Enter your current Balance: ");
            double balance = in.nextDouble();

            System.out.print("Enter the Over Draft Limit of the Bank: ");
            double overDraftLimit = in.nextDouble();


            CurrentAccount bank = new CurrentAccount(name, acc);

            bank.setOverDraftLimit(overDraftLimit);

            bank.setBalance(balance);

            System.out.println("\n--------------------------------------------\n");

            char ch = '0';
            while(ch!='q') {
                System.out.println("Press '1' to deposit amount");
                System.out.println("Press '2' to withdraw amount");
                System.out.println("Press '3 to check balance");
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.print("Enter amount to deposit: ");
                    double amt = in.nextDouble();
                    bank.deposit(amt);
                } else if (choice == 2) {
                    System.out.println("Enter amount to withdraw: ");
                    double amt = in.nextDouble();
                    bank.withDraw(amt);
                } else if (choice == 3) {
                    System.out.println("Current Balance: " + bank.getBalance());
                } else System.out.println("Invalid Input!\n");
                System.out.println("\n--------------------------------------------\n");
                System.out.println("Press any key to continue (or) Press 'q' to Quit");
                ch = in.next().charAt(0);
            }

        }
        else System.out.println("Invalid Input!");
    }
}
