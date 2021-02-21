package springIntro;

public class MySqlCustomerDal implements ICustomerDal
{
	//5.Ders - Metinsel ifadelerin(connection, email gibi) enjekte edilmesi
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add()
	{
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("MySql Veritabaný");
	}

}
