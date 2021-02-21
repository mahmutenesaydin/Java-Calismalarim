public class Main {

    public static void main(String[] args)
    {
        //Mükemmel sayi => bölenleri toplamına eşit olan sayıdır. örn 6

        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++)
        {
            if(number % i == 0)
                total = total + i;
        }
        if(total == number)
            System.out.println("Mükemmel Sayi");
        else
            System.out.println("Değil");
    }
}
