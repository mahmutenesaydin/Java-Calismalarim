import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Mahmut Enes", "Aydın"));
        customers.add(new Customer(2, "Engin", "Demiroğ"));
        customers.add(new Customer(3, "Ozzy", "AKD"));

        Customer mea = new Customer(4, "mea", "ayd");
        customers.add(mea);
        customers.remove(mea);

        for(Customer customer : customers)
            System.out.println(customer._firstName);
    }
}
