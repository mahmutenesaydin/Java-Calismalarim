import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double fiyat, kdvliFiyat, kdv;
        kdv = 0.18;
        Scanner scanner = new Scanner(System.in);
        fiyat = scanner.nextDouble();

        kdvliFiyat = fiyat + (fiyat * kdv);

        System.out.println(kdvliFiyat);
    }
}
