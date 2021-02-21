package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")  //11.Ders - Class Config ile Property Injection
public class IocConfig
{
	//9.Ders - class config i�in bean yazmak
	@Bean
	public ICustomerDal database()
	{
		return new MySqlCustomerDal();
	}
	
	//10.Ders - Ba�l� Classlar�n ��z�mlenmesi
	@Bean
	public ICustomerService service()
	{
		return new CustomerManager(database());
	}
}
