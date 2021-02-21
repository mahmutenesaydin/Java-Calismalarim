package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	//IoC = Inversion of Contrtol
	//Dependency Injection
	//Spagetti
	//SOLID
		
	
	public static void main(String[] args)
	{
		/*2.Ders - Ýlk Spring Ioc Yapýlandýrmasý*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	 	/*CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		customerManager.add();
		
		/*3.Ders - Constructor Arg ile iç içe çalýþmak*/
		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();
	}

	
}
