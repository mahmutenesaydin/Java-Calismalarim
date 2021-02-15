import java.util.Scanner;

public class Main
{
//n'den m'ye kadar olan sayılardan 7'ye tam bölünenleri bulunuz?
// n başlangıç ve m bitiş sayısı kullanıcıdan alınacaktır.
    public static void main(String[] args)
    {
        int n,m,i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n giriniz: ");
        n=scanner.nextInt();
        System.out.print("m giriniz: ");
        m= scanner.nextInt();
        for(i=n; i<m; i++)
        {
            if(i%7==0)
            {
                System.out.print(i + "  ");
            }
        }
    }
}
