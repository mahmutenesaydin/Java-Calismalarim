public class Main {

    public static void main(String[] args)
    {
        int number = 10;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = false;

        if(number==1)
        {
            System.out.println("Sayı asal değildir");
            return;
        }
        if(number<1)
        {
            System.out.println("Geçersiz sayı");
            return;
        }

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
                isPrime = true;
        }
        if (isPrime)
            System.out.println("Sayı asaldır");
        else
            System.out.println("Sayı asal değildir");
    }
}
