public class Main
{
    public static void main(String[] args)
    {
        //java'da new'leyince <Customer> yazmasakta, içi boş olsa da olur
        MyList<Customer> sehirler = new MyList<Customer>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());
        sehirler.add(new Customer());
    }
}
