public class Main
{

    public static void main(String[] args)
    {
        ICustomerDal customerDal = new MyCustomerDal();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
