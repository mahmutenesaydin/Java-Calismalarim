public class Main {

    public static void main(String[] args)
    {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("asda");


        System.out.println("-----------------------------");

//////////////////////
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new ConsoleLogger(),new FileLogger()};

        for(BaseLogger logger:loggers)
        {
            logger.log("Log Message");
        }



        System.out.println("------------------------------");

///////////////////////

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
