public class Main {

    public static void main(String[] args)
    {
        Customer customer = new Customer();
        Employee employee = new Employee();

        employee.firstName = "A";
        employee.salary = 2;
        customer.firstName = "b";
        customer.email = "@";

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        employeeManager.Add();
        employeeManager.BestEmployee();
    }
}
