import java.util.Scanner;

public class Main
{
    //EKOK : ORTAK BÖLENLER
    //EBOB : EN BÜYÜK BÖLEN

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int s1,s2,ekok,ebob; ebob =1;
        System.out.println("Lütfen sayıları giriniz: ");
        s1= scanner.nextInt();
        s2= scanner.nextInt();

        int min = (s1<s2) ? s1:s2;

        for(int i = min; i>0; i--)
        {
            if ((s1 % i == 0) && (s2 % i ==0))
            {
                ebob = i;
                break;
            }
        }
        ekok = (s1 * s2) / ebob;
        System.out.println(s1 + " ve " + s2 + " Sayılarının Ekok'u" + ekok);
        System.out.println(s1 + " ve " + s2 + " Sayılarının Ebob'u" + ebob);
    }
}
