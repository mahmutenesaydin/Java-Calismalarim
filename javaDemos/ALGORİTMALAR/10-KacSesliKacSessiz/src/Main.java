import java.util.Scanner;

public class Main
{
//Kullanıcıdan ismini ve soyismini alarak içerisinde kaç adet sesli
// kaç adet sessiz harf olduğunu bulan programı yazınız

    public static void main(String[] args)
    {
        String isim;
        int sayac = 0;

        Scanner scanner = new Scanner(System.in);
        isim = scanner.nextLine();

        for(int i = 0; i<isim.length(); i++)
        {
            char sesli = isim.charAt(i);
            if(sesli=='a' || sesli=='u' || sesli=='ö' || sesli=='ı' || sesli=='o' || sesli=='i'
                    || sesli=='e' || sesli=='ü')
            {
                sayac++;
            }
        }
        System.out.println("Sesli harf: " + sayac);
        System.out.println("Sessiz harf: " + (isim.length()-sayac));
    }
}


