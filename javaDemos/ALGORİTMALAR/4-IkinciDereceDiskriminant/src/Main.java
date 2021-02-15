import java.util.Scanner;

public class Main
{
    //kinci dereceden ax^2 + bx + c = 0 denkleminin diskriminant çözümünü yapınız?
    // Kullanıcıdan a,b ve c değerlerini alarak deltayı hesaplayınız?
    public static void main(String[] args)
    {
        int a,b,c,delta;
        float kok1,kok2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısı: ");
        a = scanner.nextInt();

        System.out.print("b sayısı: ");
        b = scanner.nextInt();

        System.out.println("c sayısı: ");
        c = scanner.nextInt();

        delta = b*b - (4 * a * c);

        if(delta > 0)
        {
            System.out.println("Denklemin iki kökü vardır");
            kok1 = (float)(-b * Math.sqrt(delta)) / 2*a;
            kok2 = (float)(-b * Math.sqrt(delta)) / 2*a;
            System.out.println("Kök 1: " + kok1);
            System.out.println("Kök 2: " + kok2);
        }
        else if (delta == 0)
        {
            System.out.println("Denklemin çakışık kökü vardır");
            kok1 = (float)(-b) / 2*a;
            System.out.println("Kökler: " + kok1);
        }
        else
        {
            System.out.println("Denklemin kökü yoktur");
        }
    }
}
