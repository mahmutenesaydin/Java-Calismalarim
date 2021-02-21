public class Main
{
    public static void main(String[] args)
    {
        AccountManager accountManager = new AccountManager();

        accountManager.getBalance();
        System.out.println("Hesap: " + accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println("Hesap: " + accountManager.getBalance());

        try
        {
            accountManager.withDraw(70);
        }
        catch (BalanceInsufficentException exception)
        {
            System.out.println(exception.getMessage());
        }

        try
        {
            accountManager.withDraw(50);
        }
        catch (BalanceInsufficentException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
