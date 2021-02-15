import java.util.Scanner;

public class Main
{
    //Kullanıcının istediği kadar sayıyı, kullanıcıdan alarak bir diziye aktaran,
    // bu sayıların toplamını ve ortalamasını bulan programını yazınız?
    public static void main(String[] args)
    {
        int boyut;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutu giriniz: ");
        boyut = scanner.nextInt();

        int[]dizi = new int[boyut];
        int toplam = 0;
        float ort;

        for(int i = 0; i < boyut; i++)
        {
            System.out.print(i + ". eleman: " );
            dizi[i] = scanner.nextInt();
            toplam += dizi[i];
        }
        ort = (float)toplam / boyut;

        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ort);
    }
}
