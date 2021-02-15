import java.util.Scanner;

public class Main
{
    //3- Kullanıcıdan alınan 3 sayının en büyüğünü bulan programı yazınız?

    public static void main(String[] args)
    {
        int sayi1, sayi2, sayi3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: sayi:");
        sayi1 = scanner.nextInt();

        System.out.println("2.sayi: ");
        sayi2 = scanner.nextInt();

        System.out.println("3.sayi: ");
        sayi3 = scanner.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3)
            System.out.println("En büyük: " + sayi1);
        else if (sayi2>sayi3 && sayi2>sayi1)
            System.out.println("En büyük: " + sayi2);
        else if (sayi3>sayi1 && sayi3>sayi2)
            System.out.println("En büyük: " + sayi3);
    }
}
