import java.util.Scanner;

public class Main
{
    //2- Kullanıcıdan iki sayı alarak bunların toplamını ve ortalamasını ekrana yazan programı yazınız?
    public static void main(String[] args)
    {
        int number1 = 10;
        int number2 = 5;

        int total;
        total = number1 + number2;
        float avg = total / 2;

        System.out.println(total);
        System.out.println(avg);


        System.out.println("--------------------------------");


        int sayi1, sayi2, toplam;
        float ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + toplam);

        ortalama = (float)toplam / 2;
        System.out.println("Ortalama: " + ortalama);




    }
}
