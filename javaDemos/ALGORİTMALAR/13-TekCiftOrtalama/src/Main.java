import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
//Kullanıcıdan 10 adet sayı alan ve tek ve çift sayıların adetini,
// toplamını ve ortalamalarını bulan programını yazınız?
    public static void main(String[] args)
    {
        int sayi, tekAdet, ciftAdet, tekToplam, ciftToplam, i;
        float tekOrtalama, ciftOrtalama;
        Scanner scanner = new Scanner(System.in);

        ciftAdet = 0;
        tekAdet = 0;
        tekToplam = 0;
        ciftToplam = 0;

        for(i=0; i<10; i++)
        {
            System.out.print(i + ". sayı: ");
            sayi = scanner.nextInt();
            if (sayi % 2 == 0)
            {
                ciftAdet++;
                ciftToplam += sayi;
            }
            else
            {
                tekAdet++;
                tekToplam += sayi;
            }
        }
        System.out.println(ciftAdet + " adet çift sayı toplamı: " + ciftToplam);
        System.out.println(tekAdet + " adet tek sayı toplamı: " + tekToplam);

        tekOrtalama = (float)tekToplam / tekAdet;
        ciftOrtalama =(float)ciftToplam / ciftAdet;

        System.out.println("Tek sayıların ortalaması : " + tekOrtalama);
        System.out.println("Çift sayıların ortalaması : " + ciftOrtalama    );
    }
}
