package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
//7.Ders - Annotation bazl� injection
@Component("database")
*/

public class CustomerDal implements ICustomerDal
{
	@Value("${database.connectionString}") //11.Ders - Class Config ile Property Injection
	
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
		System.out.println("Oracle Veritaban�");
	}
}
