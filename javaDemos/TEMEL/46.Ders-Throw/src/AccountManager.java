public class AccountManager
{
    private double balance; //miktar

    public void deposit(double amount) //para yatırma
    {
        balance = getBalance() + amount;
    }

    public void withDraw(double amount) throws Exception //para çekme
    {
        if(balance >= amount)
        {
            balance = getBalance() - amount;
        }
        else
        {
            throw new Exception("Bakiye yetersiz");
        }
    }

    public double getBalance() //parayı görüntüleme
    {
        return balance;
    }
}
