import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int sayi;
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count<=3)  //while'ı true yaparsak sonsuza kadar değer döndeririz
        {

            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0)
                System.out.println(sayi + " sayısı çifttir");
            else
                System.out.println(sayi + " sayısı tektir");

            count++;

        }

    }
}
