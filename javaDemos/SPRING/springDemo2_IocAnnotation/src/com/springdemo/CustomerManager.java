package com.springdemo;

public class CustomerManager implements ICustomerService
{
	private ICustomerDal customerDal;


	//constructor injector: sektörde genelde kullanýlan
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal = customerDal;
	}
		
	public void add()
	{
		customerDal.add();
	}
	

}
