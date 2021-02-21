package com.springdemo;

public class CustomerManager implements ICustomerService
{
	private ICustomerDal customerDal;


	//constructor injector: sekt�rde genelde kullan�lan
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal = customerDal;
	}
		
	public void add()
	{
		customerDal.add();
	}
	

}
