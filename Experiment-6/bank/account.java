package bank;

public class account
{
    String name;
    double balance;

    public account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
            System.out.println("Insufficient balance");
    }

    public void checkBalance()
    {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}