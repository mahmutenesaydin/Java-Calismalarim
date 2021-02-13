public class AccountManager
{
    private double balance; //miktar

    public void deposit(double amount) //para yatırma
    {
        balance = getBalance() + amount;
    }

    public void withDraw(double amount) throws BalanceInsufficentException //para çekme
    {
        if(balance >= amount)
        {
            balance = getBalance() - amount;
        }
        else
        {
            throw new BalanceInsufficentException("Yetersiz Bakiye"); //Yetersiz bakiye
        }
    }

    public double getBalance() //parayı görüntüleme
    {
        return balance;
    }
}
