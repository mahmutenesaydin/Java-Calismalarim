import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int sayi;
        int carpan = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for(int i = 1; i<=sayi; i++)
        {
            carpan *= i;
        }
        System.out.println("Faktöriylel: " + carpan);
    }

            /*   2.YOL    */

    public static void main2(String[] args)
    {
        int faktoriyel = 1;
        int sayi;

        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();

        while (sayi>0)
        {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriylel: " + faktoriyel);
    }
}
