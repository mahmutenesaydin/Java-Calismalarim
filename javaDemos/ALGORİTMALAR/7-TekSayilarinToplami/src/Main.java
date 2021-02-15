import java.util.Scanner;

public class Main
{
//1'den n'e kadar olan sayılardan tek olanların toplamını bulunuz?
// n sayısı kullanıcıdan alınacaktır
    public static void main(String[] args)
    {
        int n;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        n = scanner.nextInt();

        for(int i=1; i<n; i+=2)
        {
            toplam = toplam+i; //toplam += i;
        }
        System.out.println("1 - " + n + "tek sayıların toplamı: " + toplam) ;

        //2.yöntem
//        for(int a = 1; a<n; a++)
//        {
//            if(a % 2 == 1)
//                toplam += a;
//        }
    }
}
