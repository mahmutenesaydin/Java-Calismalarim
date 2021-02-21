public class MyCustomerDal implements ICustomerDal, IRepository
{
    @Override
    public void Add() {
        System.out.println("Sql Eklendi");
    }
}
