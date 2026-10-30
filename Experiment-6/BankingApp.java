import bank.account;

public class BankingApp
{
    public static void main(String[] args)
    {
        account a1 = new account("Sanat", 5000);
        account a2 = new account("Rahul", 8000);

        System.out.println("Account 1");
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.checkBalance();

        System.out.println("\nAccount 2");
        a2.deposit(3000);
        a2.withdraw(2000);
        a2.checkBalance();
    }
}