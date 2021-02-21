import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomSayi = random.nextInt(10); //10'a kadar random

        int hak = 0;
        int kalanHak = 2;

        while (hak<3)
        {
            System.out.print("Sayi GiriniZ: ");
            int tahmin = scanner.nextInt();

            if (tahmin<randomSayi)
            {
                System.out.println("Daha Büyük Düşün!!");
                if (kalanHak==0)
                    System.out.println("Hakkın Kalmadı");
                else
                    System.out.println(kalanHak + " hakkın kaldı");
            }

            else if (tahmin>randomSayi)
            {
                System.out.println("Daha Küçük Düşün!!");
                if (kalanHak==0)
                    System.out.println("Hakkın Kalmadı");
                else
                    System.out.println(kalanHak + " hakkın kaldı");
            }
            else
            {
                System.out.println("BİLDİNNN");
                break;
            }

            hak++;
            kalanHak--;
        }

        System.out.println("RANOM SAYI: " + randomSayi);
    }
}
